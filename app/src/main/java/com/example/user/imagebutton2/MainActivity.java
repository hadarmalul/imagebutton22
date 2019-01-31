package com.example.user.imagebutton2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    ImageButton ib;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.iv);
        ib = (ImageButton) findViewById(R.id.ib);

    }

    public void imgclick(View view) {
        Random rnd = new Random();
        x = rnd.nextInt(3)+1;
        if (x==1) {

            ib.setImageResource(R.drawable.one);
            iv.setImageResource(R.drawable.spongebob);}

        if (x==2)  {
            ib.setImageResource(R.drawable.two);
            iv.setImageResource(R.drawable.patrickstar);}


        if (x==3) {
            ib.setImageResource(R.drawable.three);
            iv.setImageResource(R.drawable.squidward);
         }
    }
}
