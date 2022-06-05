package com.ironhack.lab08.main.classes;

public class Movie extends Video {

    public boolean movie;
    protected String title;


    public Movie(int rating, int viewers) {
        super(rating, viewers);
        this.movie = movie;
        this.title = title;
    }

    //METHOD
    public int mediaRatingPerViewers() {
        return rating / viewers;
    }



    //GETTERS & SETTERS
    public boolean isMovie() {
        return movie;
    }

    public void setMovie(boolean movie) {
        movie = movie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
