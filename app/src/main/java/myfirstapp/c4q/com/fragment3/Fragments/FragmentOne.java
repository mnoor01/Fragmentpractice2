package myfirstapp.c4q.com.fragment3.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import myfirstapp.c4q.com.fragment3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {
    private View rootView;


    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_fragment_one, container, false);
        // Inflate the layout for this fragment
        TextView txt01=(TextView) rootView.findViewById(R.id.txt01);
        Bundle bundle= getArguments();
        String getFromEditText=bundle.getString("random01","don't know what happened");
        txt01.setText(getFromEditText);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_one, container, false);
    }

}
