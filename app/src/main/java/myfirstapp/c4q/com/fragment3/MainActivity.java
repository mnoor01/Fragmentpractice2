package myfirstapp.c4q.com.fragment3;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import myfirstapp.c4q.com.fragment3.Fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment= new MainFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();//this is where it stats to manage the fragment
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();//this is where the field for the transaction is being made.
        fragmentTransaction.replace(R.id.main_container,mainFragment);
        fragmentTransaction.commit();//this pushes the transaction through.
    }
}
