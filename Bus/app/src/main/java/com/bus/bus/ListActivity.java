package com.bus.bus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView mListView;

    String[] placeNames = {"Batu Ferringhi","Escape Adventureplay","Old Georgetown", "KOMTAR","National Park","Snake Temple","Street Art","Toy Museum","Kek Lok Si Temple","Clan Jetties"};
    Integer[] placePicture = {R.drawable.batub, R.drawable.escape, R.drawable.old, R.drawable.komtar, R.drawable.park, R.drawable.snake, R.drawable.art, R.drawable.museum, R.drawable.kek, R.drawable.clan};
    String [] desc = {"Rm10","Rm10","Rm5","Rm5","Rm5","Rm7","RM5","RM4","RM5","RM5"};

    String [] book = {"Consists of a long stretch of soft, white sandy beach along a winding road named Jalan Batu Ferringhi, filled with a host of accommodation.",
            "Fun destination with exciting rides and games hosted in a natural environment.",
            "A fascinating fusion of eastern and western influences, Penang is Malaysia’s most tourist-visited destination. The island manages to embrace modernity while retaining its colonial traditions; due to its well-preserved heritage buildings Penang’s capital, Georgetown, has been accorded a listing as a UNESCO World Cultural Heritage Site",
            "The Penang's tallest skyscraper and the sixth tallest building in Malaysia. ",
            "The majestic trees – Chengal, Meranti Seraya, Merpauh – have stood here since before the industrial revolution, seen two world wars and lived through the decline of the British empire.",
            "Legend has it that the monk gave shelter to the snakes and when the temple was completed after his death, they moved in on their own.",
            "An effort to spawn awareness of the rich history of the streets, the project was a success with Zacharevic turning certain areas into thriving tourist destinations that also became the much-talked about object of attention among locals.",
            "It is the largest museums filled with hundreds of thousands of toys. The museum is a must visit attraction in Penang as this is where all the fun begins.",
            "It is a Buddhist temple situated in Penang facing the sea and commanding an impressive view, and is one of the best known temples on the island. It is said to be the largest Buddhist temple in Malaysia.",
            "Busy, scenic destination featuring a traditional village of rustic houses on stilts over the water."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        mListView = (ListView) findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter(this, placeNames, placePicture,desc, book);
        mListView.setAdapter(myAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Intent mIntent = new Intent(ListActivity.this, InfoActivity.class);
                mIntent.putExtra("placeNames", placeNames[i]);
                mIntent.putExtra("placePicture", placePicture[i]);
                startActivity(mIntent);

            }

        });
    }
}
