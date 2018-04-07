package com.example.user.kknkuy;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPengumuman extends Fragment {


    private FragmentManager supportFragmentManager;

    public FragmentPengumuman() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragmen_oprec, container, false);
        Button button = (Button) rootView.findViewById(R.id.tambah_oprec);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.mainLayout, new FragmentTambahPengumuman())
                        .commit();
            }
        });
        return rootView;
    }

}
