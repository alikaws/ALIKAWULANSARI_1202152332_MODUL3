package com.example.alita_pc.alikawulansari_1202152332_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Alita-pc on 2/25/2018.
 */

public class DetailActivity extends AppCompatActivity {

    private ImageView level;
    private TextView levelIndicator;
    private int minLevel = 0;
    private int currentLevel = 0;
    private int maxLevel = 4;
    private String txtIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        TextView title = (TextView) findViewById(R.id.titleDetail);
        levelIndicator = (TextView) findViewById(R.id.airIndicator);
        String iTitle = intent.getStringExtra("Judul");

        title.setText(iTitle);

        level = (ImageView) findViewById(R.id.airLevel);

        Log.d("level ", "level: "+txtIndicator);

    }

    //method menambahkan level pada icon botol
    public void addLevel(View view) {
        //jika di klik pada level naik 1 level
        currentLevel+=1;

        //Statement untuk pengecekkan agar level tidak melebihi maksimum level
        if (currentLevel<=maxLevel){
            level.setImageLevel(currentLevel+=1);
            levelIndicator.setText(currentLevel+"L");

            //Statement untuk menampilkan toast yang berisi pesan kalau air sudah penuh
            if (currentLevel==maxLevel){
                Toast.makeText(this, "Air penuh", Toast.LENGTH_SHORT).show();
            }
            Log.d("current level", "Current Level: "+currentLevel);

            //else untuk menjaga agar level tidak melebihi maksimum level
        }else{
            currentLevel=maxLevel;
            txtIndicator=currentLevel+"L";
        }


    }
    //method mengurangi level pada icon botol
    public void decreaseLevel(View view) {
        //jika di klik level berkurang 1 level
        currentLevel-=1;
        //if statement untuk pengecekan apakah level kurang dari minimum level
        if (currentLevel>=minLevel){
            level.setImageLevel(currentLevel-=1);
            levelIndicator.setText(currentLevel+"L");

            //menampilkan toast jika level sama dengan minimum level
            if  (currentLevel==minLevel){
                Toast.makeText(this, "Air sedikit", Toast.LENGTH_SHORT).show();
            }
            //else untuk menjaga agar level tidak kurang dari minimum level
        }else{
            currentLevel=minLevel;
            txtIndicator=currentLevel+"L";;
        }
    }
}
