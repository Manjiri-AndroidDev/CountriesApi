package com.example.countriesapi.Model;

import com.example.countriesapi.Model.CountryModel;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CountryClient {
    @SerializedName("countrylist")
    private ArrayList<CountryModel> countrylist;

    public ArrayList<CountryModel> getCountryByRegion() {
        return countrylist;
    }

    public void setCountryByRegion(ArrayList<CountryModel> countrylist) {
        this.countrylist = countrylist;
    }
}
