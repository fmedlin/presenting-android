package org.fmedlin.jumpin;

import java.util.ArrayList;

public class DisplayNewsPresenter {
    DisplayNewsModel model;
    DisplayNewsView view;

    public DisplayNewsPresenter(DisplayNewsModel model, DisplayNewsView view) {
        this.model = model;
        this.view = view;
        model.fetchLatestNews();
    }

    public void onFetchedNews(NewsFetchedEvent event) {
        model.getLatestNews();
        view.displayLatestNews(new ArrayList<ArticleSummary>());
    }
}
