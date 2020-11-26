package com.example.countriesapi.Api;

import com.example.countriesapi.Model.CountryClient;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CountryClientInterface {

    @GET("rest/v2/region/asia")
    Call<CountryClient> getCountryByRegion();

}
