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

        int story;
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
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //Get extras send from intents
            Bundle passed = getIntent().getExtras();
            //Get the chosen story.
            story = passed.getInt("storyChosen");
            if(passed.getBoolean("exists")) {
                this.musicState = passed.getBoolean("start");
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
                        musicReset();
                        Back.setImageResource(R.drawable.ic_action_menu);
                        image.setImageResource(R.drawable.assin01);
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

            if(!musicState())
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
        public void changeStory(){
            if(Next.isPressed()) {
                if(this.story < 7) {
                    mySound.stop();
                    Intent storyIntent = new Intent(this,
                            VerhaalActivity.class);

                    storyIntent.putExtra("callingActivity", "VerhaalActivity");
                    storyIntent.putExtra("storyChosen", this.story + 1);
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
            else if(this.story > 1){
                Intent storyIntentBack = new Intent(this,
                        VerhaalActivity.class);
                musicReset();
                storyIntentBack.putExtra("callingActivity", "VerhaalActivity");
                storyIntentBack.putExtra("storyChosen", this.story - 1);
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

