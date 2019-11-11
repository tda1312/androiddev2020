package vn.edu.usthweather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("onCreate","Creating weather activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart","Starting");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume","Resuming");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause","Resuming");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop","Stopping");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy","Weather activity is being destroyed");
    }
}
