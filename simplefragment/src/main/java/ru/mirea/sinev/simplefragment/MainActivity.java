package ru.mirea.sinev.simplefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Fragment fragment1, fragment2;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFragment(View view) {
        fragmentManager = getSupportFragmentManager();
        switch (view.getId()){
            case R.id.firstFragmentBtn:
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer,
                        fragment1).commit();
                break;
            case R.id.secondFragmentBtn:
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer,
                        fragment2).commit();
                break;
            default:
                break;
        }
    }
}