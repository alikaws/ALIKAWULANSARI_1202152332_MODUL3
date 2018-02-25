package com.example.alita_pc.alikawulansari_1202152332_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Alita-pc on 2/25/2018.
 */

public class Login extends AppCompatActivity {

    Button button;
    EditText user,pass;

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //menyambungkan variable yang dibuat sebelumnya dengan edit text dan button pada layout
        user = (EditText) findViewById(R.id.uname);
        pass = (EditText) findViewById(R.id.passwd);
        button = (Button) findViewById(R.id.btnlogin);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {


                if (user.getText().toString().equals("EAD") && pass.getText().toString().equals("MOBILE")) {
                    displayToast("Berhasil");
                    Intent intent  = new Intent(v.getContext(), MainActivity.class);
                    startActivity(intent);
//                    startActivity(intent);


                } else {
                    displayToast("Gagal");
                }
            }


        });
    }
    }
