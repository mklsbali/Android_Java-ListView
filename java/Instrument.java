package com.example.mymusicalapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Instrument extends AppCompatActivity {
    private  int id;
    private MediaPlayer[] sounds;
    private Button[] buttons;
    private String[] names={"C","C^'","D","D^","E","F","F^","G","G^","A","A^","B"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
            this.getSupportActionBar().hide();
        }catch (NullPointerException e){};
        setContentView(R.layout.activity_piano);
        buttons=new Button[12];
        buttons[0]=(Button)findViewById(R.id.b11);
        buttons[1]=(Button)findViewById(R.id.b12);
        buttons[2]=(Button)findViewById(R.id.b13);
        buttons[3]=(Button)findViewById(R.id.b14);
        buttons[4]=(Button)findViewById(R.id.b21);
        buttons[5]=(Button)findViewById(R.id.b22);
        buttons[6]=(Button)findViewById(R.id.b23);
        buttons[7]=(Button)findViewById(R.id.b24);
        buttons[8]=(Button)findViewById(R.id.b31);
        buttons[9]=(Button)findViewById(R.id.b32);
        buttons[10]=(Button)findViewById(R.id.b33);
        buttons[11]=(Button)findViewById(R.id.b34);
        for (int i=0;i<12;i++)
            buttons[i].setText(names[i]);



    }

}
