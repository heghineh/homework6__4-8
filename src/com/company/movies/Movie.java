package com.company.movies;

public class Movie {
    //region Properties
    private String title;
    private int rating;
    //endregion

    //region Constructors
    Movie() {
    }

    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }
    //endregion

    //region Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    //endregion
}