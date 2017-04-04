package com.example.aarongoodman.tabletopcharactermanager;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    List<Character> myDataSet;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myDataSet = new ArrayList<>();
        Character newCharacter = new Character();
        Character secondCharacter = new Character("Taako", 10, 14, 8, 16, 13, 8, 17, 12);
        Character thirdCharacter = new Character("Magnus", 33, 9, 17, 15, 14, 10, 12, 12);

        myDataSet.add(newCharacter);
        myDataSet.add(secondCharacter);
        myDataSet.add(thirdCharacter);

        final Button createCharacterButton = (Button) findViewById(R.id.createCharacterButtonId);
        createCharacterButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Make Character Button Works",
                        Toast.LENGTH_SHORT).show();

                Intent createCharacterIntent  = new Intent(v.getContext(),
                        CreateCharacterActivity.class);
                startActivity(createCharacterIntent);

            }
        });

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);

        //Linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        mAdapter = new MyAdapter((ArrayList<Character>) myDataSet, getApplicationContext());
        mRecyclerView.setAdapter(mAdapter);





    }
}
