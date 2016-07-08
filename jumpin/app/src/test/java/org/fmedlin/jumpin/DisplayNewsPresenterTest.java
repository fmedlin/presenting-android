package org.fmedlin.jumpin;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.verify;

public class DisplayNewsPresenterTest {

    DisplayNewsPresenter presenter;
    @Mock DisplayNewsModel model;
    @Mock DisplayNewsView view;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        presenter = new DisplayNewsPresenter(model, view);
    }

    @Test
    public void itShouldFetchLatestNews() {
        verify(model).fetchLatestNews();
    }

    @Test
    public void itShouldDisplayNews() {
        presenter.onFetchedNews(new NewsFetchedEvent());
        verify(model).getLatestNews();
        verify(view).displayLatestNews(anyListOf(ArticleSummary.class));
    }
}