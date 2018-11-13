package com.bolaah.eko;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<com.bolaah.eko.Word>();
        words.add(new com.bolaah.eko.Word("father", "әpә", R.drawable.hotel_avenue_suites));
        words.add(new com.bolaah.eko.Word("mother", "әṭa", R.drawable.hotel_de_renaissance));
        words.add(new com.bolaah.eko.Word("son", "angsi", R.drawable.hotel_eko ));
        words.add(new com.bolaah.eko.Word("daughter", "tune", R.drawable.hotel_four_points ));
        words.add(new com.bolaah.eko.Word("older brother", "taachi", R.drawable.hotel_george ));
        words.add(new com.bolaah.eko.Word("younger brother", "chalitti", R.drawable.hotel_ibis ));
        words.add(new com.bolaah.eko.Word("older sister", "teṭe", R.drawable.hotel_lagos_oriental ));
        words.add(new com.bolaah.eko.Word("daughter", "tune", R.drawable.hotel_radisson_blue_nchorage ));
        words.add(new com.bolaah.eko.Word("older brother", "taachi", R.drawable.hotel_sheraton));
        words.add(new com.bolaah.eko.Word("younger brother", "chalitti", R.drawable.hotel_southern_sun));
        words.add(new com.bolaah.eko.Word("older sister", "teṭe", R.drawable.hotel_wheatbaker));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        com.bolaah.eko.WordAdapter adapter = new com.bolaah.eko.WordAdapter(getActivity(), words, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

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
