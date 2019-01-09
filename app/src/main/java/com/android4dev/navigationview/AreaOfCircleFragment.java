package com.android4dev.navigationview;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Admin on 04-06-2015.
 */
public class AreaOfCircleFragment extends Fragment {

    private ListView guidesList;
    private SwipeRefreshLayout swipeContainer;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_areaofcircle,container,false);

//        mEdt_Radius = (EditText) v.findViewById(R.id.edt_radius);
//        mEdt_Result = (EditText) v.findViewById(R.id.edt_result);
//
//        mBtn_Calculate = (Button) v.findViewById(R.id.button);
//
//        mBtn_Calculate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                double radius,result;
//
//                radius = Double.parseDouble(mEdt_Radius.getText().toString());
//                result = 3.14*radius*radius;
//                mEdt_Result.setText(String.valueOf(result));
//            }
//        });
//              guidesList =(ListView) v.findViewById(R.id.guidesList);
//              empty_view=(TextView) v.findViewById(R.id.empty_view);
        swipeContainer=(SwipeRefreshLayout)v.findViewById(R.id.swipe_container);
        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                // Your code here
                Toast.makeText(getActivity(), "Works!", Toast.LENGTH_LONG).show();
                // To keep animation for 4 seconds
                new Handler().postDelayed(new Runnable() {
                    @Override public void run() {
                        // Stop animation (This will be after 3 seconds)
                        swipeContainer.setRefreshing(false);
                    }
                }, 4000); // Delay in millis
            }
        });

        // Scheme colors for animation

        swipeContainer.setColorSchemeColors(

                getResources().getColor(android.R.color.holo_blue_light),

                getResources().getColor(android.R.color.holo_green_light),

                getResources().getColor(android.R.color.holo_orange_light),

                getResources().getColor(android.R.color.holo_red_light)

        );











        return v;
    }


}
