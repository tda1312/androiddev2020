package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class WeatherActivity extends AppCompatActivity {

    public void onFragmentInteraction(Uri uri){
        Log.i("Tag", "onFragmentInteraction called");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("onCreate", "Creating");

        ForecastFragment fragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_forecast, fragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "Starting");

    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.i("onReumse", "Resuming");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "Pausing");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop", "Stopping");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "Destroying");
    }
}