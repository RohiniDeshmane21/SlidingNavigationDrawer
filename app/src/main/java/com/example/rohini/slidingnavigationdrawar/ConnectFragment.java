package com.example.rohini.slidingnavigationdrawar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ConnectFragment extends Fragment {

    public ConnectFragment() {
    }

        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Intent intent = new Intent(getActivity(), MainActivity.class);
        //startActivity(intent);
        View rootView = inflater.inflate(R.layout.fragment_connect, container, false);

     /*   final Button button = (Button) rootView.findViewById(R.id.mainActiviyBtn);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });*/

       return rootView;
    }

}