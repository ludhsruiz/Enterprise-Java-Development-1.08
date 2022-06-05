package com.ironhack.lab08.main.classes;

public class TvSerie extends Video {

    public boolean tvSerie;
    public String title;

    public TvSerie(int rating, int viewers) {
        super(rating, viewers);
        this.tvSerie = tvSerie;
        this.title = title;
    }

    //METHODS
    public int mediaRatingPerViewers() {
        return rating / viewers;
    }



    //GETTERS & SETTERS
    public boolean isTvSerie() {
        return tvSerie;
    }

    public void setTvSerie(boolean tvSerie) {
        this.tvSerie = tvSerie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
