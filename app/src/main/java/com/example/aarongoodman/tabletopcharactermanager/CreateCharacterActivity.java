package com.example.aarongoodman.tabletopcharactermanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CreateCharacterActivity extends AppCompatActivity {

        Character currentCharacter;
        List<Character> characterList = new ArrayList<>();

        String nameString = "Please Input Name ";
        int hpInteger = 0;
        int perceptionInteger = 0;
        int strInteger = 0;
        int dexInteger = 0;
        int conInteger = 0;
        int wisInteger = 0;
        int intelInteger = 0;
        int chaInteger = 0;


        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_create_character);

            currentCharacter = new Character();

            final EditText submitName = (EditText) findViewById(R.id.submitNameId);

            final EditText submitHp = (EditText) findViewById(R.id.submitHpId);

            final EditText submitPerception = (EditText) findViewById(R.id.submitPerceptionId);

            final EditText submitStr = (EditText) findViewById(R.id.submitStrId);

            final EditText submitDex = (EditText) findViewById(R.id.submitDexId);

            final EditText submitCon = (EditText) findViewById(R.id.submitConId);

            final EditText submitWis = (EditText) findViewById(R.id.submitWisId);

            final EditText submitIntel = (EditText) findViewById(R.id.submitIntelId);

            final EditText submitCha = (EditText) findViewById(R.id.submitChaId);


            final Button submitButton = (Button) findViewById(R.id.submitButtonId);
            submitButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Toast.makeText(CreateCharacterActivity.this, currentCharacter.getName(),
                            Toast.LENGTH_SHORT).show();

                    String nameString = submitName.getText().toString();
                    int hpInteger = Integer.parseInt(submitHp.getText().toString());
                    int perceptionInteger = Integer.parseInt(submitPerception.getText().toString());
                    int strInteger = Integer.parseInt(submitStr.getText().toString());
                    int dexInteger = Integer.parseInt(submitDex.getText().toString());
                    int conInteger = Integer.parseInt(submitCon.getText().toString());
                    int wisInteger = Integer.parseInt(submitWis.getText().toString());
                    int intelInteger = Integer.parseInt(submitIntel.getText().toString());
                    int chaInteger = Integer.parseInt(submitCha.getText().toString());


                    currentCharacter = new Character(nameString, hpInteger, perceptionInteger,
                            strInteger, dexInteger, conInteger, wisInteger, intelInteger, chaInteger);
                    characterList.add(currentCharacter);
                }
            });

        final Button viewListButton = (Button) findViewById(R.id.viewListButtonId);
        viewListButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(CreateCharacterActivity.this, "List Button Works",
                        Toast.LENGTH_SHORT).show();

                Intent viewListIntent = new Intent(v.getContext(), MainActivity.class);
                startActivity(viewListIntent);

            }
        });
    }
}

