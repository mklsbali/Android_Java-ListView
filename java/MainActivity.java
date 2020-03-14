package com.example.mymusicalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    String elements[]={"Piano","Guitar","Violin","Trumpet","Flute", };
    int images[]={R.drawable.piano, R.drawable.guitar, R.drawable.violin, R.drawable.trumpet, R.drawable.flute};
    ArrayAdapter instrumentAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try{
            this.getSupportActionBar().hide();
        }catch (NullPointerException e){}
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.mainList);
        MyAdapter adapter=new MyAdapter(this, elements, images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent i=new Intent(MainActivity.this, Instrument.class);
                    startActivity(i);
                }
            }
        });

    }


    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String rTitles[];
        int rImages[];
        MyAdapter(Context c, String titles[], int images[]){
            super(c, R.layout.row, R.id.textView1, titles);
            this.context=c;
            this.rTitles=titles;
            this.rImages=images;
        }

        public View getView(int position, View converView, ViewGroup parent){
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView image=row.findViewById(R.id.image);
            TextView text=row.findViewById(R.id.textView1);

            image.setImageResource(rImages[position]);
            text.setText(rTitles[position]);

            return  row;
        }

    }
}
