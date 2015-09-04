package example.com.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Vishal on 9/4/2015.
 */
public class FirstFragmentClass extends Fragment {

    @Override
    public View onCreateView(LayoutInflater layoutInflater,ViewGroup contaner,Bundle bundle){
        View rootView=layoutInflater.inflate(R.layout.fragment_first_layout,contaner,false);
        return rootView;
    }
}
