package vn.edu.usth.weather;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class WeatherAndForecastFragment extends Fragment {


    public WeatherAndForecastFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();

        WeatherFragment weatherFragment = new WeatherFragment();
        weatherFragment.setArguments(this.getArguments());

        ForecastFragment forecastFragment = new ForecastFragment();
        forecastFragment.setArguments(this.getArguments());

        fragmentTransaction.replace(R.id.frame_fragment_weather, weatherFragment).replace(R.id.frame_fragment_forecast, forecastFragment);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.commit();

        LinearLayout fragment = (LinearLayout) inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);

        return fragment;
    }

}
