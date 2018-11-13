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
public class EkoFragment extends Fragment {



    public EkoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);




        // Create a list of words
        final ArrayList<Word> words = new ArrayList<com.bolaah.eko.Word>();
        words.add(new com.bolaah.eko.Word("onejjjj jjkjol ijoljgogf kjrolgkor ki", "lutikjfe oekfjoelk okpoke ekdlkolrti", R.drawable.eko_main));
        words.add(new com.bolaah.eko.Word("tw awsrhgjkj fsdjkjkl jkjkk klklnjk o", "otiiko", R.drawable.eko_mall));
        words.add(new com.bolaah.eko.Word("three", "tolookosu", R.drawable.eko_hotels));
        words.add(new com.bolaah.eko.Word("four", "oyyisa", R.drawable.eko_museum));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        com.bolaah.eko.WordAdapter adapter = new com.bolaah.eko.WordAdapter(getActivity(), words, R.color.category_numbers);

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
