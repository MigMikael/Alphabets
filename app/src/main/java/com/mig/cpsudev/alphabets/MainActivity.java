package com.mig.cpsudev.alphabets;


import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements AlphabetListFragment.MyListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void loadFragment(int i) {

        AlphabetFragment frag = AlphabetFragment.newInstance(i);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fragment_container, frag);
        transaction.commit();
    }


    @Override
    public void onAlphabetListItemClicked(int position) {

        if (findViewById(R.id.fragment_container) == null){
            //portrait
            Intent i = new Intent(MainActivity.this, DetailActivity.class);
            i.putExtra("alphabet_index", position);
            startActivity(i);

        }else{
            //landscape
            loadFragment(position);
        }

    }
}
