package vn.edu.usthweather;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {

    @Override()
    public View oncreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = new View(getContext());
        v.setBackgroundColor(30, 0, 0, 0b11111111);
        return v;
    }
}
