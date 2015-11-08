package com.mig.cpsudev.alphabets;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mig.cpsudev.alphabets.model.EnglishAlphabet;

/**
 * Created by Mig on 08-Nov-15.
 */
public class AlphabetListFragment extends ListFragment{

    interface MyListener {
        public void onAlphabetListItemClicked(int position);
    }

    private MyListener listener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<EnglishAlphabet> adapter = new ArrayAdapter<>(
            getActivity(),
            android.R.layout.simple_list_item_1,
            EnglishAlphabet.DATA
        );
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        listener.onAlphabetListItemClicked(position);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        listener = (MyListener) context;
    }
}

