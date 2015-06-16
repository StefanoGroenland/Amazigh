package com.example.rahul.amazigh;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

/**
 * Created by thies on 8-6-15.
 */
public class VerhaalActivity extends AppCompatActivity {

        static MediaPlayer mySound = null;

        int story;

        ImageView image;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Bundle passed = getIntent().getExtras();
            story = passed.getInt("storyChosen");
            setContentView(R.layout.activity_verhaal);
            image = (ImageView)  findViewById(R.id.imageView);

            switch (story) {
                case 1:
                    image.setImageResource(R.drawable.massin01small);
                    System.out.println("Story1 Selected!");
                    break;
                case 2:
                    image.setImageResource(R.drawable.story2);
                    System.out.println("Story2 Selected!");
                    break;
                default:
                    System.out.println("No image selected");
                    break;
            }

            if(mySound == null)
            {
                mySound = MediaPlayer.create(this, R.raw.audio);
            }
            if(!mySound.isPlaying())
            {
                mySound.start();
            }

        }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
//            if (id == R.id.action_settings) {
//                return true;
//            }

            return super.onOptionsItemSelected(item);
        }

        @Override
        public void onBackPressed(){
            mySound.stop();
            mySound.release();
            finish();
        }

}

