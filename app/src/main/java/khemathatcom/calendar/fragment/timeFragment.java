package khemathatcom.calendar.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

import khemathatcom.calendar.R;


/**
 * Created by nuuneoi on 11/16/2014.
 */
public class timeFragment extends Fragment {

    TextView dateView;
    Button time10_00,time10_15,time10_30,time10_45;
    int date,month,year;
    String time;


    public timeFragment() {
        super();
    }

    public static timeFragment newInstance(int strName,int strName2,int strName3) {
        timeFragment fragment = new timeFragment();
        Bundle args = new Bundle();
        args.putInt("Date",strName);
        args.putInt("Month",strName2);
        args.putInt("Year",strName3);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_time, container, false);




        initInstances(rootView);

         date = getArguments().getInt("Date");
         month = getArguments().getInt("Month");
         year = getArguments().getInt("Year");
        Log.d("Date", String.valueOf(date));

        dateView.setText(String.valueOf(date));


        return rootView;
    }

    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here
        dateView = rootView.findViewById(R.id.date);
        time10_00 = rootView.findViewById(R.id.btnTime10_00);
        time10_15 = rootView.findViewById(R.id.btnTime10_15);
        time10_30 = rootView.findViewById(R.id.btnTime10_30);
        time10_45 = rootView.findViewById(R.id.btnTime10_45);
        final Calendar calendar = Calendar.getInstance();


        time10_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                calendar.set(year,month,date,10,00);

                Log.d("Date", String.valueOf(calendar.getTime()));


            }
        });

        time10_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                calendar.set(year,month,date,10,15);

                Log.d("Date", String.valueOf(calendar.getTime()));


            }
        });

        time10_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                calendar.set(year,month,date,10,30);

                Log.d("Date", String.valueOf(calendar.getTime()));


            }
        });

        time10_45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                calendar.set(year,month,date,10,45);

                Log.d("Date", String.valueOf(calendar.getTime()));


            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    /*
     * Save Instance State Here
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save Instance State here
    }

    /*
     * Restore Instance State Here
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            // Restore Instance State here
        }
    }
}
