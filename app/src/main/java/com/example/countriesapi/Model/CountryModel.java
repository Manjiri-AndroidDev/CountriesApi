package com.example.countriesapi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class CountryModel  {

    @SerializedName("name")

    private String name;
    @SerializedName("capital")

    private String capital;
    @SerializedName("flagurl")

    private String flagurl;
    @SerializedName("region")

    private String region;
    @SerializedName("subregion")

    private String subregion;
    @SerializedName("population")

    private int population;
    @SerializedName("borders")

    private ArrayList<String> borders;
    @SerializedName("languages")

    private ArrayList<LanguageModel> languages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getFlagurl() {
        return flagurl;
    }

    public void setFlagurl(String flagurl) {
        this.flagurl = flagurl;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public ArrayList<String> getBorders() {
        return borders;
    }

    public void setBorders(ArrayList<String> borders) {
        this.borders = borders;
    }

    public ArrayList<LanguageModel> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<LanguageModel> languages) {
        this.languages = languages;
    }
}
