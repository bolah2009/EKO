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
public class MallFragment extends Fragment {


    public MallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<com.bolaah.eko.Word>();
        words.add(new com.bolaah.eko.Word("red", "weṭeṭṭi", R.drawable.mall_adeniran_ogunsanya ));
        words.add(new com.bolaah.eko.Word("mustard yellow", "chiwiiṭә", R.drawable.mall_ikeja_city ));
        words.add(new com.bolaah.eko.Word("dusty yellow", "ṭopiisә", R.drawable.mall_maryland ));
        words.add(new com.bolaah.eko.Word("mustard yellow", "chiwiiṭә", R.drawable.mall_novare ));
        words.add(new com.bolaah.eko.Word("dusty yellow", "ṭopiisә", R.drawable.mall_palms ));
        words.add(new com.bolaah.eko.Word("mustard yellow", "chiwiiṭә", R.drawable.mall_silverbird_galleria ));
        words.add(new com.bolaah.eko.Word("dusty yellow", "ṭopiisә", R.drawable.mall_tejuosho ));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        com.bolaah.eko.WordAdapter adapter = new com.bolaah.eko.WordAdapter(getActivity(), words, R.color.category_colors);

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
