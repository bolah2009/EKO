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
        words.add(new Word(getString(R.string.mall_adeniran_ogunsanya), getString(R.string.mall_adeniran_ogunsanya_b), R.drawable.mall_adeniran_ogunsanya));
        words.add(new Word(getString(R.string.mall_ikeja_city), getString(R.string.mall_ikeja_city_b), R.drawable.mall_ikeja_city));
        words.add(new Word(getString(R.string.mall_maryland), getString(R.string.mall_maryland_b), R.drawable.mall_maryland));
        words.add(new Word(getString(R.string.mall_novare), getString(R.string.mall_novare_b), R.drawable.mall_novare));
        words.add(new Word(getString(R.string.mall_palms), getString(R.string.mall_palms_b), R.drawable.mall_palms));
        words.add(new Word(getString(R.string.mall_silverbird_galleria), getString(R.string.mall_silverbird_galleria_b), R.drawable.mall_silverbird_galleria));
        words.add(new Word(getString(R.string.mall_tejuosho), getString(R.string.mall_tejuosho_b), R.drawable.mall_tejuosho));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        com.bolaah.eko.WordAdapter adapter = new com.bolaah.eko.WordAdapter(getActivity(), words, R.color.category_colors);

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
