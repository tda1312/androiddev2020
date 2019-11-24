package vn.edu.usth.weather;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class HomeFragmentPagerAdapter extends FragmentPagerAdapter{
    private final int PAGE_COUNT = 3;
    private String titles[] = new String[] {"Hanoi", "Fukuoka", "Paris"};

    public  HomeFragmentPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public int getCount(){
        return PAGE_COUNT; // number of pages for a ViewPager
    }

    @Override
    public Fragment getItem(int curent_page){
        //return an instance of Fragment corresponding to the specified page
        switch (curent_page){
            case 0:
                WeatherAndForecastFragment fragment1 = new WeatherAndForecastFragment();
                return fragment1;
            case 1:
                WeatherAndForecastFragment fragment2 = new WeatherAndForecastFragment();
                return fragment2;
            case 2:
                WeatherAndForecastFragment fragment3 = new WeatherAndForecastFragment();
                return fragment3;

                default:
                    return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int page){
        // returns a tab title corresponding to the specified page
        return titles[page];
    }
}