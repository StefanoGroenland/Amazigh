package com.example.rahul.amazigh;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    private int chosenBtn = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    public int getButtonChosen(View v){
        switch (v.getId()) {
            case R.id.button1:
                this.chosenBtn = 1;
                break;
            case R.id.button2:
                this.chosenBtn = 2;
                break;
            case R.id.button3:
                this.chosenBtn = 3;
                break;
            case R.id.button4:
                this.chosenBtn = 4;
                break;
            case R.id.button5:
                this.chosenBtn = 5;
                break;
            case R.id.button6:
                this.chosenBtn = 6;
                break;
            case R.id.button7:
                this.chosenBtn = 7;
                break;
        }
        return this.chosenBtn;
    }
    public void onGetVerhaalClick(View view) {
        getButtonChosen(view);
        Intent getNameScreenIntent = new Intent(this,
                VerhaalActivity.class);
        final int result = 1;
        getNameScreenIntent.putExtra("callingActivity", "MainActivity");
        getNameScreenIntent.putExtra("storyChosen",getButtonChosen(view));
        getNameScreenIntent.putExtra("start",false);
        getNameScreenIntent.putExtra("exists",false);
        startActivity(getNameScreenIntent);

    }
}
