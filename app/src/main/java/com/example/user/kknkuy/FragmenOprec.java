package com.example.user.kknkuy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmenOprec extends Fragment {


    public FragmenOprec() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment_pengumuman, container, false);
        Button button = (Button) rootView.findViewById(R.id.tambah_pengumuman);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.mainLayout, new FragmentTambahOprec())
                        .commit();
            }
        });
        return rootView;
    }

}
