package com.example.rahul.amazigh;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by thies on 8-6-15.
 */
public class VerhaalActivity extends AppCompatActivity {

        static MediaPlayer mySound = null;
        int pageTracker;
        int tracker;
        int story;
        int massinTracker,
                aichaTracker,
                ayardaTracker,
                ijuyTracker,
                jakubTracker,
                tcacitTracker,
                jackTracker,
                ijnwassTracker,
                ayyulTracker;

        ImageButton Next;
        ImageButton Back;
        boolean musicState = false;

        ImageView image;

    private View.OnClickListener NextButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String tag = "Next";
            Toast.makeText(getApplicationContext(), tag,
                    Toast.LENGTH_LONG).show();
            changeStory();
        }
    };

    private View.OnClickListener BackButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String tag = "Back";
            Toast.makeText(getApplicationContext(), tag,
                    Toast.LENGTH_LONG).show();
            changeStory();
        }
    };
    public void musicS(){
        if(!musicState() )
        {
            mySound.start();
            this.musicState = true;
        }
    }
    public boolean musicState() {
        return this.musicState;
    }
    public void musicReset(){
        if(musicState()){
            mySound.release();
        }
    }
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //Get extras send from intents
            Bundle passed = getIntent().getExtras();
            //Get the chosen story.
            story = passed.getInt("storyChosen");
            if(passed.getBoolean("exists")) {
//                this.musicState = passed.getBoolean("start");
                this.musicState = false;
            }
            setContentView(R.layout.activity_verhaal);
            //Get the imageView
            image = (ImageView)  findViewById(R.id.imageView);
            //Get the Buttons
            Next = (ImageButton) findViewById(R.id.Next);
            Back = (ImageButton) findViewById(R.id.Back);
            //Set Onclick listeners
            Next.setOnClickListener(NextButtonListener);
            Back.setOnClickListener(BackButtonListener);
            System.out.println(musicState());
            if( !musicState() ){
                switch (story) {

                    case 1:
                        storyMassin();
                        break;
                    case 2:
                        storyAicha();
                        break;
                    case 3:
                        storyAyarda();
                        break;
                    case 4:
                        storyIjuy();
                        break;
                    case 5:
                        storyJakub();
                        break;
                    case 6:
                        storyTcacit();
                        break;
                    case 7:
                        storyJack();
                        break;
                    case 8:
                        storyIjnwass();
                        break;
                    case 9:
                        storyAyyul();
                        break;
                    default:
                        System.out.println("No story selected");
                        break;
                }
            }
            musicS();

        }

    //            functions for the stories can be found below
    public void storyMassin(){
        switch (massinTracker){
            case 1:
                musicReset();
                musicS();
                Back.setImageResource(R.drawable.ic_action_menu);
                image.setImageResource(R.drawable.assin01);
                mySound = MediaPlayer.create(this, R.raw.massin01);
                break;
            case 2:
                musicReset();
                image.setImageResource(R.drawable.assin02);
                mySound = MediaPlayer.create(this, R.raw.massin02);
                break;
            case 3:
                musicReset();
                image.setImageResource(R.drawable.assin03);
                mySound = MediaPlayer.create(this, R.raw.massin03);
                break;
            case 4:
                musicReset();
                image.setImageResource(R.drawable.assin04);
                mySound = MediaPlayer.create(this, R.raw.massin04);
                break;
            case 5:
                musicReset();
                image.setImageResource(R.drawable.assin05);
                mySound = MediaPlayer.create(this, R.raw.massin05);
                break;
            case 6:
                musicReset();
                image.setImageResource(R.drawable.assin06);
                mySound = MediaPlayer.create(this, R.raw.massin06);
                break;
            case 7:
                musicReset();
                image.setImageResource(R.drawable.assin07);
                mySound = MediaPlayer.create(this, R.raw.massin07);
                break;
            default:
                System.out.println("No story selected");
                break;
        }
    }
    public void storyAicha(){
        switch (aichaTracker){
            case 1:
                musicReset();
                Back.setImageResource(R.drawable.ic_action_menu);
                image.setImageResource(R.drawable.aicha_01);
                mySound = MediaPlayer.create(this, R.raw.massin01);
                break;
            case 2:
                musicReset();
                image.setImageResource(R.drawable.aicha_02);
                mySound = MediaPlayer.create(this, R.raw.aicha_02);
                break;
            case 3:
                musicReset();
                image.setImageResource(R.drawable.aicha_03);
                mySound = MediaPlayer.create(this, R.raw.aicha_03);
                break;
            case 4:
                musicReset();
                image.setImageResource(R.drawable.aicha_04);
                mySound = MediaPlayer.create(this, R.raw.aicha_04);
                break;
            default:
                System.out.println("No story selected");
                break;
        }

    }
    public void storyAyarda(){
        switch (ayardaTracker){
            case 1:
                musicReset();
                Back.setImageResource(R.drawable.ic_action_menu);
                image.setImageResource(R.drawable.ayarda_01);
                mySound = MediaPlayer.create(this, R.raw.massin01);
                break;
            case 2:
                musicReset();
                image.setImageResource(R.drawable.ayarda_02);
                mySound = MediaPlayer.create(this, R.raw.massin02);
                break;
            case 3:
                musicReset();
                image.setImageResource(R.drawable.ayarda_03);
                mySound = MediaPlayer.create(this, R.raw.massin03);
                break;
            case 4:
                musicReset();
                image.setImageResource(R.drawable.ayarda_04);
                mySound = MediaPlayer.create(this, R.raw.massin04);
                break;
            case 5:
                musicReset();
                image.setImageResource(R.drawable.ayarda_05);
                mySound = MediaPlayer.create(this, R.raw.massin05);
                break;
            case 6:
                musicReset();
                image.setImageResource(R.drawable.ayarda_05);
                mySound = MediaPlayer.create(this, R.raw.massin06);
                break;
            case 7:
                musicReset();
                image.setImageResource(R.drawable.ayarda_06);
                mySound = MediaPlayer.create(this, R.raw.massin07);
                break;
            case 8:
                musicReset();
                image.setImageResource(R.drawable.ayarda_07);
                mySound = MediaPlayer.create(this, R.raw.massin07);
                break;
            default:
                System.out.println("No story selected");
                break;
        }

    }
    public void storyIjuy(){
        switch (ijuyTracker){
            case 1:
                musicReset();
                Back.setImageResource(R.drawable.ic_action_menu);
                image.setImageResource(R.drawable.uyennej_01);
                mySound = MediaPlayer.create(this, R.raw.massin01);
                break;
            case 2:
                musicReset();
                image.setImageResource(R.drawable.uyennej_02);
                mySound = MediaPlayer.create(this, R.raw.massin02);
                break;
            case 3:
                musicReset();
                image.setImageResource(R.drawable.uyennej_03);
                mySound = MediaPlayer.create(this, R.raw.massin03);
                break;
            default:
                System.out.println("No story selected");
                break;
        }

    }
    public void storyJakub(){
        switch (jakubTracker){
            case 1:
                musicReset();
                Back.setImageResource(R.drawable.ic_action_menu);
                image.setImageResource(R.drawable.jakub_01);
                mySound = MediaPlayer.create(this, R.raw.massin01);
                break;
            case 2:
                musicReset();
                image.setImageResource(R.drawable.jakub_02);
                mySound = MediaPlayer.create(this, R.raw.massin02);
                break;
            case 3:
                musicReset();
                image.setImageResource(R.drawable.jakub_03);
                mySound = MediaPlayer.create(this, R.raw.massin03);
                break;
            case 4:
                musicReset();
                image.setImageResource(R.drawable.jakub_04);
                mySound = MediaPlayer.create(this, R.raw.massin04);
                break;
            case 5:
                musicReset();
                image.setImageResource(R.drawable.jakub_05);
                mySound = MediaPlayer.create(this, R.raw.massin05);
                break;
            case 6:
                musicReset();
                image.setImageResource(R.drawable.jakub_06);
                mySound = MediaPlayer.create(this, R.raw.massin06);
                break;
            case 7:
                musicReset();
                image.setImageResource(R.drawable.jakub_07);
                mySound = MediaPlayer.create(this, R.raw.massin07);
                break;
            default:
                System.out.println("No story selected");
                break;
        }

    }
    public void storyTcacit(){
        switch (tcacitTracker){
            case 1:
                musicReset();
                Back.setImageResource(R.drawable.ic_action_menu);
                image.setImageResource(R.drawable.tcacit_01);
                mySound = MediaPlayer.create(this, R.raw.massin01);
                break;
            case 2:
                musicReset();
                image.setImageResource(R.drawable.tcacit_02);
                mySound = MediaPlayer.create(this, R.raw.massin02);
                break;
            case 3:
                musicReset();
                image.setImageResource(R.drawable.tcacit_03);
                mySound = MediaPlayer.create(this, R.raw.massin03);
                break;
            case 4:
                musicReset();
                image.setImageResource(R.drawable.tcacit_04);
                mySound = MediaPlayer.create(this, R.raw.massin04);
                break;
            case 5:
                musicReset();
                image.setImageResource(R.drawable.tcacit_05);
                mySound = MediaPlayer.create(this, R.raw.massin05);
                break;
            case 6:
                musicReset();
                image.setImageResource(R.drawable.tcacit_06);
                mySound = MediaPlayer.create(this, R.raw.massin06);
                break;
            default:
                System.out.println("No story selected");
                break;
        }

    }
    public void storyJack(){
        switch (jackTracker){
            case 1:
                musicReset();
                Back.setImageResource(R.drawable.ic_action_menu);
                image.setImageResource(R.drawable.jack_01);
                mySound = MediaPlayer.create(this, R.raw.massin01);
                break;
            case 2:
                musicReset();
                image.setImageResource(R.drawable.jack_02);
                mySound = MediaPlayer.create(this, R.raw.massin02);
                break;
            case 3:
                musicReset();
                image.setImageResource(R.drawable.jack_03);
                mySound = MediaPlayer.create(this, R.raw.massin03);
                break;
            case 4:
                musicReset();
                image.setImageResource(R.drawable.jack_04);
                mySound = MediaPlayer.create(this, R.raw.massin04);
                break;
            case 5:
                musicReset();
                image.setImageResource(R.drawable.jack_05);
                mySound = MediaPlayer.create(this, R.raw.massin05);
                break;
            case 6:
                musicReset();
                image.setImageResource(R.drawable.jack_06);
                mySound = MediaPlayer.create(this, R.raw.massin06);
                break;
            case 7:
                musicReset();
                image.setImageResource(R.drawable.jack_07);
                mySound = MediaPlayer.create(this, R.raw.massin07);
                break;
            case 8:
                musicReset();
                image.setImageResource(R.drawable.jack_08);
                mySound = MediaPlayer.create(this, R.raw.massin07);
                break;
            case 9:
                musicReset();
                image.setImageResource(R.drawable.jack_09);
                mySound = MediaPlayer.create(this, R.raw.massin07);
                break;
            case 10:
                musicReset();
                image.setImageResource(R.drawable.jack_10);
                mySound = MediaPlayer.create(this, R.raw.massin07);
                break;
            default:
                System.out.println("No story selected");
                break;
        }

    }
    public void storyIjnwass(){
        switch (ijnwassTracker){
            case 1:
                musicReset();
                Back.setImageResource(R.drawable.ic_action_menu);
                image.setImageResource(R.drawable.wass_01);
                mySound = MediaPlayer.create(this, R.raw.massin01);
                break;
            case 2:
                musicReset();
                image.setImageResource(R.drawable.wass_02);
                mySound = MediaPlayer.create(this, R.raw.massin02);
                break;
            case 3:
                musicReset();
                image.setImageResource(R.drawable.wass_03);
                mySound = MediaPlayer.create(this, R.raw.massin03);
                break;
            case 4:
                musicReset();
                image.setImageResource(R.drawable.wass_04);
                mySound = MediaPlayer.create(this, R.raw.massin04);
                break;
            default:
                System.out.println("No story selected");
                break;
        }

    }
    public void storyAyyul(){
        switch (ayyulTracker){
            case 1:
                musicReset();
                Back.setImageResource(R.drawable.ic_action_menu);
                image.setImageResource(R.drawable.wuccen_01);
                mySound = MediaPlayer.create(this, R.raw.massin01);
                break;
            case 2:
                musicReset();
                image.setImageResource(R.drawable.wuccen_02);
                mySound = MediaPlayer.create(this, R.raw.massin02);
                break;
            default:
                System.out.println("No story selected");
                break;
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
            finish();
        }

    public int getChosen(){
        return story;
    }
    public void changeLine(){
        switch (getChosen()){
            case 1:
                story = 1;
                tracker = massinTracker;
                pageTracker = 7;
            break;
            case 2:
                story = 2;
                tracker = aichaTracker;
                pageTracker = 4;
                break;
            case 3:
                story = 3;
                tracker = ayardaTracker;
                pageTracker = 7;
                break;
            case 4:
                story = 4;
                tracker = ijuyTracker;
                pageTracker = 3;
                break;
            case 5:
                story = 5;
                tracker = jakubTracker;
                pageTracker = 7;
                break;
            case 6:
                story = 6;
                tracker = tcacitTracker;
                pageTracker = 6;
                break;
            case 7:
                story = 7;
                tracker = jackTracker;
                pageTracker = 10;
                break;
            case 8:
                story = 8;
                tracker = ijnwassTracker;
                pageTracker = 4;
                break;
            case 9:
                story = 9;
                tracker = ayyulTracker;
                pageTracker = 2;
                break;

        }
    }
        public void changeStory(){
            changeLine();
            if(Next.isPressed()) {
                if(this.tracker < pageTracker) {
                    mySound.stop();
                    Intent storyIntent = new Intent(this,
                            VerhaalActivity.class);

                    storyIntent.putExtra("callingActivity", "VerhaalActivity");
                    storyIntent.putExtra("storyChosen", this.story);
                    tracker = tracker + 1;
                    storyIntent.putExtra("start",false);
                    storyIntent.putExtra("exists",true);
                    this.finish();
                    startActivity(storyIntent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                } else{
                    Intent storyIntentMain = new Intent(this,
                            MainActivity.class);
                    musicReset();
                    this.finish();
                    startActivity(storyIntentMain);
                }
            }
            else if(this.tracker > 1){
                Intent storyIntentBack = new Intent(this,
                        VerhaalActivity.class);
                musicReset();
                storyIntentBack.putExtra("callingActivity", "VerhaalActivity");
                storyIntentBack.putExtra("storyChosen", this.story);
                tracker = tracker - 1;
                storyIntentBack.putExtra("start",false);
                storyIntentBack.putExtra("exists",true);
                this.finish();
                startActivity(storyIntentBack);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
            }
            else{
                Intent storyIntentMain = new Intent(this,
                        MainActivity.class);
                musicReset();
                this.finish();
                startActivity(storyIntentMain);

            }
        }
}

