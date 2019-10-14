package com.project.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.project.myapplication.R;
import com.project.myapplication.modelclass.Film;

import java.util.List;

public class FilmAdapter  extends RecyclerView.Adapter<FilmAdapter.ViewHolder> {
    private List<Film> listItems;
    public Context mContext;


    public FilmAdapter(List<Film> listItems,Context mContext) {
        this.listItems = listItems;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_item_recycler, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {


        final Film itemList = listItems.get(position);



        //holder.photofilm.setImageResource(Integer.parseInt(itemList.getImage()));
        holder.name.setText(itemList.getName());
        holder.country.setText(itemList.getCountries());
        holder.year.setText(String.valueOf(itemList.getYear()));
        holder.age.setText(String.valueOf(itemList.getAge()));


    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

       // ImageView photofilm;
        TextView name;
        TextView country;
        TextView year;
        TextView age;

        ViewHolder(View itemView) {
            super(itemView);

          //  photofilm = itemView.findViewById(R.id.photofilm);
            name = itemView.findViewById(R.id.name_film);
            country = itemView.findViewById(R.id.country_film);
            year = itemView.findViewById(R.id.year_film);
            age = itemView.findViewById(R.id.age_film);

        }
    }

}
