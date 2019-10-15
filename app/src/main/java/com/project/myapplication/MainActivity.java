package com.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.project.myapplication.adapter.FilmAdapter;
import com.project.myapplication.adapter.Pagination;
import com.project.myapplication.modelclass.Film;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private FilmAdapter adapter;



    ProgressBar progressBar;
    private static final int PAGE_START = 0;
    private boolean isLoading = false;
    private boolean isLastPage = false;
    private int TOTAL_PAGES = 3;
    private int currentPage = PAGE_START;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        ArrayList<Film> list = new ArrayList<>();



        try {

            String jsonText = readText(this, R.raw.jsonfilms);
            JSONArray jsonarray = new JSONArray(jsonText);

            for (int i = 0; i < jsonarray.length(); i++) {

                JSONObject jsonobject = jsonarray.getJSONObject(i);
                Gson gson = new Gson();
                Film film = gson.fromJson(String.valueOf(jsonobject),Film.class);
                list.add(film);

            }

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }


        adapter = new FilmAdapter(list,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

       /* recyclerView.addOnScrollListener(new Pagination(new LinearLayoutManager(this)) {
            @Override
            protected void loadMoreItems() {
                isLoading = true;
                //Increment page index to load the next one
                currentPage += 1;
              //  loadNextPage();
            }

            @Override
            public int getTotalPageCount() {
                return TOTAL_PAGES;
            }

            @Override
            public boolean isLastPage() {
                return isLastPage;
            }

            @Override
            public boolean isLoading() {
                return isLoading;
            }
        });*/
       // loadFirstPage();
    }

    /*private void loadNextPage() {
        List <Film> movies = Film.createMovies(adapter.getItemCount()); // 1
        adapter.removeLoadingFooter(); // 2
        isLoading = false; // 3
        adapter.addAll(movies); // 4
        if (currentPage != TOTAL_PAGES) adapter.addLoadingFooter(); // 5
        else isLastPage = true;
    }
    private void loadFirstPage() {
        // fetching dummy data
        List <Film> movies = Film.createMovies(adapter.getItemCount());
        progressBar.setVisibility(View.GONE);
        adapter.addAll(movies);

        if (currentPage <= TOTAL_PAGES) adapter.addLoadingFooter();
        else isLastPage = true;
    }
*/

    private static String readText(Context context, int resId) throws IOException {
        InputStream is = context.getResources().openRawResource(resId);
        BufferedReader br= new BufferedReader(new InputStreamReader(is));
        StringBuilder sb= new StringBuilder();
        String s= null;

        while((s = br.readLine())!=null) {
            sb.append(s);
            sb.append("\n");
        }
        return sb.toString();
    }
}
