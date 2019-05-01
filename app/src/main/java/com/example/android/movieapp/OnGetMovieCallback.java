package com.example.android.movieapp;

public interface OnGetMovieCallback {
    void onSuccess(Movie movie);

    void onError();


}
