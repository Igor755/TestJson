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
    private boolean isLoadingAdded = false;

    public FilmAdapter(List<Film> listItems,Context mContext) {
        this.listItems = listItems;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_item_recycler, parent, false);


        return new ViewHolder(v);
    }
   /* @Override
    public int getItemViewType(int position) {
        return (position == listItems.size() - 1 && isLoadingAdded) ? LOADING : ITEM;
    }*/

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
        return listItems == null ? 0 : listItems.size();
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
    public void add(Film mc) {
        listItems.add(mc);
        notifyItemInserted(listItems.size() - 1);
    }

    public void addAll(List < Film > mcList) {
        for (Film mc: mcList) {
            add(mc);
        }
    }

    public void remove(Film city) {
        int position = listItems.indexOf(city);
        if (position > -1) {
            listItems.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void clear() {
        isLoadingAdded = false;
        while (getItemCount() > 0) {
            remove(getItem(0));
        }
    }

    public boolean isEmpty() {
        return getItemCount() == 0;
    }

    public void addLoadingFooter() {
        isLoadingAdded = true;
        add(new Film());
    }

    public void removeLoadingFooter() {
        isLoadingAdded = false;

        int position = listItems.size() - 1;
        Film item = getItem(position);
        if (item != null) {
            listItems.remove(position);
            notifyItemRemoved(position);
        }
    }

    public Film getItem(int position) {
        return listItems.get(position);
    }

}
