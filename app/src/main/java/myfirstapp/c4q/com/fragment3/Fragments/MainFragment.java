package myfirstapp.c4q.com.fragment3.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import myfirstapp.c4q.com.fragment3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    private View rootView;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_main, container, false);
        final Button button1=(Button) rootView.findViewById(R.id.button1);
        Button button2=(Button) rootView.findViewById(R.id.button2);
        Button button3=(Button) rootView.findViewById(R.id.button3);
        Button button4=(Button) rootView.findViewById(R.id.button4);
        Button button5=(Button) rootView.findViewById(R.id.button5);
        final EditText editText= (EditText) rootView.findViewById(R.id.mainedit);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //first instantiate the fragment
                FragmentOne fragmentOne= new FragmentOne();
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                //now I am going to make the edittext into a string.
                String editTextContent= editText.getText().toString();
                Bundle bundle=new Bundle(); //this is so when I click the button it save the information.
                bundle.putString("random",editTextContent);
                fragmentOne.setArguments(bundle);
                fragmentTransaction.replace(R.id.main_container,fragmentOne).addToBackStack("random");

            }
        });
        // Inflate the layout for this fragment
        return rootView;
    }

}
