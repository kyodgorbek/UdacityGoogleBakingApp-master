package com.edgar.yodgorbekkomilov.yodgorbekkomilov;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.edgar.yodgorbekkomilov.yodgorbekkomilov.pojo.Recipe;
import com.edgar.yodgorbekkomilov.yodgorbekkomilov.pojo.Step;

import java.util.ArrayList;

import static android.app.PendingIntent.getActivity;


/**
 * Created by yodgorbekkomilov on 10/10/17.
 */


public class DetailActivity extends AppCompatActivity {


    public ArrayList<Step> stepsList;
    public Recipe recipe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        if (savedInstanceState == null) {
            DetailFragment detailFragment = new DetailFragment();

            Bundle extras = getIntent().getExtras();
            if (extras != null) {

               // stepsList = extras.getParcelableArrayList("stepsList");
                detailFragment.setArguments(extras);
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.detailContainer, detailFragment).commit();
        }

    }
}




