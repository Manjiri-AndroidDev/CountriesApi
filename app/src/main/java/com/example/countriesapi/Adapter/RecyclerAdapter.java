package com.example.countriesapi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.countriesapi.Model.CountryModel;
import com.example.countriesapi.Model.LanguageModel;
import com.example.countriesapi.R;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context mContext;
    private ArrayList<CountryModel> countryModelArrayList;
    //private ArrayList<LanguageModel> languageModelArrayList;

    public RecyclerAdapter(Context mContext,ArrayList<CountryModel> countryModelArrayList) {
        this.mContext=mContext;
        this.countryModelArrayList = countryModelArrayList;
        //this.languageModelArrayList=languageModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_displaydata, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txt_countryname.setText(countryModelArrayList.get(position).getName());
        holder.txt_countrycapital.setText(countryModelArrayList.get(position).getCapital());
        holder.txt_region.setText(countryModelArrayList.get(position).getRegion());
        holder.txt_subregion.setText(countryModelArrayList.get(position).getSubregion());
        holder.txt_population.setText(countryModelArrayList.get(position).getPopulation());
        holder.txt_borders.setText(countryModelArrayList.get(position).getBorders().toString());
        holder.txt_language.setText(countryModelArrayList.get(position).getLanguages().toString());

        Glide.with(mContext)
                .asBitmap()
                .load(countryModelArrayList.get(position).getFlagurl())
                .into(holder.img_countryflag);
    }

    @Override
    public int getItemCount() {
        return (countryModelArrayList==null)?0:countryModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_countryname, txt_countrycapital, txt_region, txt_subregion, txt_population, txt_borders,
                txt_language;
        ImageView img_countryflag;

        public ViewHolder(View view) {
            super(view);
            txt_countryname = (TextView) view.findViewById(R.id.txt_countryname);
            txt_countrycapital = (TextView) view.findViewById(R.id.txt_countrycapital);
            txt_region = (TextView) view.findViewById(R.id.txt_region);
            txt_subregion = (TextView) view.findViewById(R.id.txt_subregion);
            txt_population = (TextView) view.findViewById(R.id.txt_population);
            txt_borders = (TextView) view.findViewById(R.id.txt_borders);
            txt_language = (TextView) view.findViewById(R.id.txt_language);
            img_countryflag = (ImageView) view.findViewById(R.id.img_countryflag);
        }
    }
}
