//
// DO NOT EDIT THIS FILE.
// Generated using AndroidAnnotations 4.1.0.
// 
// You can create a larger work that contains this file and distribute that work under terms of your choice.
//

package tk.lucasapps.omdb.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;
import tk.lucasapps.omdb.R;

public final class MovieDetailsFragment_
    extends tk.lucasapps.omdb.fragment.MovieDetailsFragment
    implements HasViews, OnViewChangedListener
{
    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private View contentView_;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    @Override
    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(R.layout.fragment_movie_details, container, false);
        }
        return contentView_;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        contentView_ = null;
        title = null;
        year = null;
        directors = null;
        actors = null;
        plot = null;
        poster = null;
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static MovieDetailsFragment_.FragmentBuilder_ builder() {
        return new MovieDetailsFragment_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        this.title = ((TextView) hasViews.findViewById(R.id.details_title));
        this.year = ((TextView) hasViews.findViewById(R.id.details_year));
        this.directors = ((TextView) hasViews.findViewById(R.id.details_directors));
        this.actors = ((TextView) hasViews.findViewById(R.id.details_actors));
        this.plot = ((TextView) hasViews.findViewById(R.id.details_plot));
        this.poster = ((ImageView) hasViews.findViewById(R.id.details_poster));
        View view_add_to_pending_button = hasViews.findViewById(R.id.add_to_pending_button);

        if (view_add_to_pending_button!= null) {
            view_add_to_pending_button.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {
                    MovieDetailsFragment_.this.onAddToPendingButtonPressed();
                }
            }
            );
        }
        getMovieDetails();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<MovieDetailsFragment_.FragmentBuilder_, tk.lucasapps.omdb.fragment.MovieDetailsFragment>
    {

        @Override
        public tk.lucasapps.omdb.fragment.MovieDetailsFragment build() {
            MovieDetailsFragment_ fragment_ = new MovieDetailsFragment_();
            fragment_.setArguments(args);
            return fragment_;
        }
    }
}