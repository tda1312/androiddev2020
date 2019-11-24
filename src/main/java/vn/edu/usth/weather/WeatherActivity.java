package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.TableLayout;

public class WeatherActivity extends AppCompatActivity {

    public void onFragmentInteraction(Uri uri){
        Log.i("Tag", "onFragmentInteraction called");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("onCreate", "Creating");

        PagerAdapter adapter = new HomeFragmentPagerAdapter(getSupportFragmentManager());

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
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