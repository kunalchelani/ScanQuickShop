package com.example.kunal.scanquickshop;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ImageView iv = (ImageView)rootView.findViewById(R.id.homescreen);
        iv.setImageResource(R.drawable.wm);

        final Button button = (Button)rootView.findViewById(R.id.shop);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                //  Intent intent =  new Intent(getActivity(), CartActivity.class).putStringArrayListExtra("Cart", cart);
                Intent intent = new Intent(getActivity(), ScanActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
