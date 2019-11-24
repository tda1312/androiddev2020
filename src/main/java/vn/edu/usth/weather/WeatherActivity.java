package vn.edu.usth.weather;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TableLayout;
import com.google.android.material.tabs.TabLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

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

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);

        int[] tabIcons = {
                R.drawable.ic_me,
                R.drawable.ic_love,
                R.drawable.ic_france
        };

        for(int i = 0; i < tabLayout.getTabCount(); i++){
            tabLayout.getTabAt(i).setIcon(tabIcons[i]);
        }
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