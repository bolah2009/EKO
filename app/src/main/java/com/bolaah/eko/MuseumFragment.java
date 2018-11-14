package com.bolaah.eko;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<com.bolaah.eko.Word>();
        words.add(new Word(getString(R.string.museum_badagry_heritage), getString(R.string.museum_badagry_heritage_b), R.drawable.museum_badagry_heritage));
        words.add(new Word(getString(R.string.museum_didi), getString(R.string.museum_didi_b), R.drawable.museum_didi));
        words.add(new Word(getString(R.string.museum_jaekel), getString(R.string.museum_jaekel_b), R.drawable.museum_jaekel));
        words.add(new Word(getString(R.string.museum_kalakuta), getString(R.string.museum_kalakuta_b), R.drawable.museum_kalakuta));
        words.add(new Word(getString(R.string.museum_mindscapes_children), getString(R.string.museum_mindscapes_children_b), R.drawable.museum_mindscapes_children));
        words.add(new Word(getString(R.string.museum_nigerian_national), getString(R.string.museum_nigerian_national_b), R.drawable.museum_nigerian_national));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        com.bolaah.eko.WordAdapter adapter = new com.bolaah.eko.WordAdapter(getActivity(), words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();

    }

}
