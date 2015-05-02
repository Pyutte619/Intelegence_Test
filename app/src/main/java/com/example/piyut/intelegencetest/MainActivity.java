package com.example.piyut.intelegencetest;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MainActivity extends Activity {
    String[] deskp={"1","2","3","4","5","6","7","8"};
    int[] images={R.drawable.sample_0,R.drawable.sample_1,R.drawable.sample_2,R.drawable.sample_3,R.drawable.sample_4,R.drawable.sample_5,R.drawable.sample_6,R.drawable.sample_7,};
    ListView listView;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    listView= (ListView) findViewById(R.id.listView);
    myAdapter adapter=new myAdapter(this,deskp,images);
    listView.setAdapter(adapter);
    }

    class myAdapter extends ArrayAdapter{
Context context;
        int[] images;
        String[] deskrip;

        public myAdapter(Context context, String[] deskrip, int[] images) {

            super(context,R.layout.activity_item,deskrip);
            this.context=context;
            this.images=images;
            this.deskrip=deskrip;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
            View row=inflater.inflate(R.layout.activity_item,parent,false);

            ImageView imageView= (ImageView) row.findViewById(R.id.imageView);
            TextView textView= (TextView) row.findViewById(R.id.textView);

            imageView.setImageResource(images[position]);
            textView.setText(deskrip[position]);

    return row;
        }
    }
}
