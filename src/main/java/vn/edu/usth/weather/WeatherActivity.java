package vn.edu.usth.weather;

import android.media.MediaPlayer;
import android.os.Environment;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TableLayout;
import com.google.android.material.tabs.TabLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WeatherActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

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

        InputStream is = getResources().openRawResource(R.raw.mylove);

        writeExternal();

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.mylove);
        mediaPlayer.start();

    }

    private void writeExternal(){
        String fileName = "mylove.mp3";
        String filePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data";
        File file = new File(filePath + fileName);
        try {
            OutputStream fos;
            InputStream is = getApplicationContext().getResources().openRawResource(R.raw.mylove);
            file.createNewFile();
            fos = new FileOutputStream(file);
            fos.write(is.read());
            fos.close();
            is.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
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
        mediaPlayer.stop();
        mediaPlayer.release();
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