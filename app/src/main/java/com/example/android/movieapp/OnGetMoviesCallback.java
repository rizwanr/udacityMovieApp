package com.example.android.movieapp;

import java.util.List;

public interface OnGetMoviesCallback {
    void onSuccess(int page, List<Movie> movies);

    void onError();
}
