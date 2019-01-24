package in.androidmate.anujgupta.movify.ui.main;

import in.androidmate.anujgupta.movify.models.MovieResponse;

/**
 * Created by anujgupta on 26/12/17.
 */

public interface MainViewInterface {

    void showToast(String s);
    void showProgressBar();
    void hideProgressBar();
    void displayMovies(MovieResponse movieResponse);
    void displayError(String s);
}
