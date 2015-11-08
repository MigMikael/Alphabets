package com.mig.cpsudev.alphabets;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mig.cpsudev.alphabets.model.EnglishAlphabet;


public class AlphabetFragment extends Fragment {

    private int mAlphabetIndex;

    public AlphabetFragment() {
        // Required empty public constructor
    }

    public static AlphabetFragment newInstance(int alphabetIndex){  //like method Toast.makeText
        AlphabetFragment fragment = new AlphabetFragment();
        Bundle args = new Bundle();
        args.putInt("alphabet_index", alphabetIndex);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAlphabetIndex = getArguments().getInt("alphabet_index");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alphabet, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tv = (TextView) view.findViewById(R.id.alphabet_textview);
        tv.setText(String.valueOf(EnglishAlphabet.DATA[mAlphabetIndex].letter));

        //add image here
    }
}
