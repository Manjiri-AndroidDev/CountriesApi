package com.example.countriesapi.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.countriesapi.Adapter.RecyclerAdapter;
import com.example.countriesapi.Api.CountryClientInterface;
import com.example.countriesapi.Api.RetrofitInstance;
import com.example.countriesapi.MainActivity;
import com.example.countriesapi.Model.CountryClient;
import com.example.countriesapi.Model.CountryModel;
import com.example.countriesapi.Model.LanguageModel;
import com.example.countriesapi.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DisplayContinentsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    ArrayList<CountryModel> countryModelArrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_continents);



        /*Create handle for the RetrofitInstance interface*/
        CountryClientInterface countryClientInterface = RetrofitInstance.getRetrofitInstance().create(CountryClientInterface.class);
        Call<CountryClient> call=countryClientInterface.getCountryByRegion();

        call.enqueue(new Callback<CountryClient>() {
            @Override
            public void onResponse(Call<CountryClient> call, Response<CountryClient> response) {
                initRecyclerView(response.body().getCountryByRegion());
    }
            @Override
            public void onFailure(Call<CountryClient> call, Throwable t) {
                Toast.makeText(DisplayContinentsActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
            }

    private void initRecyclerView(ArrayList<CountryModel> countryModels) {
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        recyclerAdapter = new RecyclerAdapter(getApplicationContext(), countryModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(DisplayContinentsActivity.this));
        recyclerView.setAdapter(recyclerAdapter);
    }
}
