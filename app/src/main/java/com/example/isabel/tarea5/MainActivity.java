package com.example.isabel.tarea5;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        String colorHex = "#000000";

        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);

    SeekBar rColor;
    SeekBar gColor;
    SeekBar bColor;

    View view;
        @Override
    protected  void onCreate (Bundle savedIntanceState) {
            super.onCreate(savedIntanceState);
            setContentView(R.layout.activity_main);

            //View colorSample = findViewById(R.id.view);
            //colorSample.setBackgroundColor(Color.parseColor(colorHex));

            rColor = findViewById(R.id.rColor);
            gColor = findViewById(R.id.gColor);
            bColor = findViewById(R.id.bColor);
            view = findViewById(R.id.view);

            rColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {

                    textView1.setText("R:" + i);
                    String hex = "#" + ColorUtils.decimalToHex(rColor.getProgress()) + ColorUtils.decimalToHex(gColor.getProgress()) + ColorUtils.decimalToHex(bColor.getProgress());
                    textView4.setText(hex);
                    view.setBackgroundColor(Color.parseColor(hex));

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {


                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

            gColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {

                    textView2.setText("G:" + i);
                    String hex = "#" + ColorUtils.decimalToHex(rColor.getProgress()) + ColorUtils.decimalToHex(gColor.getProgress()) + ColorUtils.decimalToHex(bColor.getProgress());
                    textView4.setText(hex);
                    view.setBackgroundColor(Color.parseColor(hex));

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {


                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

            bColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {

                    textView3.setText("G:" + i);
                    String hex = "#" + ColorUtils.decimalToHex(rColor.getProgress()) + ColorUtils.decimalToHex(gColor.getProgress()) + ColorUtils.decimalToHex(bColor.getProgress());
                    textView4.setText(hex);
                    view.setBackgroundColor(Color.parseColor(hex));

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {


                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

        }

    }

