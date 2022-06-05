package com.ironhack.lab08.main.classes;


public abstract class Video {

    protected int rating;
    protected int viewers;

    public Video(int rating, int viewers) {
        this.rating = rating;
        this.viewers = viewers;
    }

    public abstract int mediaRatingPerViewers();
    public abstract String mostViewed();
    public abstract String lessLiked();




    //GETTERS & SETTERS
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getViewers() {
        return viewers;
    }

    public void setViewers(int viewers) {
        this.viewers = viewers;
    }

}





