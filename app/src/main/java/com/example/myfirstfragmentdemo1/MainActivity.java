package com.example.myfirstfragmentdemo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Press(View view){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.details_container,new FirstFragment());
        ft.addToBackStack(null);
        ft.commit();
    }

    public void onButton2Press(View view){

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.details_container,new SecondFragment());
        ft.addToBackStack(null);
        ft.commit();

    }

    public void onButton3Press(View view){

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment fragment = fm.findFragmentById(R.id.details_container);
        ft.remove(fragment);
        ft.addToBackStack(null);
        ft.commit();

    }

    public void onButton4Press(View view){
        FragmentManager fm = getSupportFragmentManager();
        fm.popBackStack();
    }
}
