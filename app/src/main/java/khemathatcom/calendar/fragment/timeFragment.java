package khemathatcom.calendar.fragment;

import android.content.Intent;
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
public class timeFragment extends Fragment implements View.OnClickListener {

    TextView dateView;
    final Calendar calendar = Calendar.getInstance();
    Button time9_00,time9_15,time9_30,time9_45,btntime;
    Button time10_00,time10_15,time10_30,time10_45;
    Button time11_00,time11_15,time11_30,time11_45;
    Button time14_00,time14_15,time14_30,time14_45;
    Button time15_00,time15_15,time15_30,time15_45;
    Button time16_00,time16_15,time16_30,time16_45;
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


        Log.d("Date2", String.valueOf(calendar.getTime()));

        return rootView;
    }



    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here
        dateView = rootView.findViewById(R.id.date);
        time9_00 = rootView.findViewById(R.id.btnTime9_00);
        time9_15 = rootView.findViewById(R.id.btnTime9_15);
        time9_30 = rootView.findViewById(R.id.btnTime9_30);
        time9_45 = rootView.findViewById(R.id.btnTime9_45);

        time10_00 = rootView.findViewById(R.id.btnTime10_00);
        time10_15 = rootView.findViewById(R.id.btnTime10_15);
        time10_30 = rootView.findViewById(R.id.btnTime10_30);
        time10_45 = rootView.findViewById(R.id.btnTime10_45);

        time11_00 = rootView.findViewById(R.id.btnTime11_00);
        time11_15 = rootView.findViewById(R.id.btnTime11_15);
        time11_30 = rootView.findViewById(R.id.btnTime11_30);
        time11_45 = rootView.findViewById(R.id.btnTime11_45);

        time14_00 = rootView.findViewById(R.id.btnTime14_00);
        time14_15 = rootView.findViewById(R.id.btnTime14_15);
        time14_30 = rootView.findViewById(R.id.btnTime14_30);
        time14_45 = rootView.findViewById(R.id.btnTime14_45);

        time15_00 = rootView.findViewById(R.id.btnTime15_00);
        time15_15 = rootView.findViewById(R.id.btnTime15_15);
        time15_30 = rootView.findViewById(R.id.btnTime15_30);
        time15_45 = rootView.findViewById(R.id.btnTime15_45);

        time16_00 = rootView.findViewById(R.id.btnTime16_00);
        time16_15 = rootView.findViewById(R.id.btnTime16_15);
        time16_30 = rootView.findViewById(R.id.btnTime16_30);
        time16_45 = rootView.findViewById(R.id.btnTime16_45);




        time9_00.setOnClickListener(this);
        time9_15.setOnClickListener(this);
        time9_30.setOnClickListener(this);
        time9_45.setOnClickListener(this);

        time10_00.setOnClickListener(this);
        time10_15.setOnClickListener(this);
        time10_30.setOnClickListener(this);
        time10_45.setOnClickListener(this);

        time11_00.setOnClickListener(this);
        time11_15.setOnClickListener(this);
        time11_30.setOnClickListener(this);
        time11_45.setOnClickListener(this);

        time14_00.setOnClickListener(this);
        time14_15.setOnClickListener(this);
        time14_30.setOnClickListener(this);
        time14_45.setOnClickListener(this);

        time15_00.setOnClickListener(this);
        time15_15.setOnClickListener(this);
        time15_30.setOnClickListener(this);
        time15_45.setOnClickListener(this);

        time16_00.setOnClickListener(this);
        time16_15.setOnClickListener(this);
        time16_30.setOnClickListener(this);
        time16_45.setOnClickListener(this);



    }



    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Date3", String.valueOf(calendar.getTime()));
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

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnTime9_00 :
                calendar.set(year,month,date,9,00);
                break;
            case R.id.btnTime9_15 :
                calendar.set(year,month,date,9,15);
                upToFirebase();
                break;
            case R.id.btnTime9_30 :
                calendar.set(year,month,date,9,30);
                upToFirebase();
                break;
            case R.id.btnTime9_45 :
                calendar.set(year,month,date,9,45);
                upToFirebase();
                break;
            case R.id.btnTime10_00 :
                calendar.set(year,month,date,10,00);
                upToFirebase();
                break;
            case R.id.btnTime10_15 :
                calendar.set(year,month,date,10,15);
                upToFirebase();
                break;
            case R.id.btnTime10_30 :
                calendar.set(year,month,date,10,30);
                upToFirebase();
                break;
            case R.id.btnTime10_45 :
                calendar.set(year,month,date,10,45);
                upToFirebase();
                break;

            case R.id.btnTime11_00 :
                calendar.set(year,month,date,11,00);
                break;
            case R.id.btnTime11_15 :
                calendar.set(year,month,date,11,15);
                upToFirebase();
                break;
            case R.id.btnTime11_30 :
                calendar.set(year,month,date,11,30);
                upToFirebase();
                break;
            case R.id.btnTime11_45 :
                calendar.set(year,month,date,11,45);
                upToFirebase();
                break;
            case R.id.btnTime14_00 :
                calendar.set(year,month,date,14,00);
                upToFirebase();
                break;
            case R.id.btnTime14_15 :
                calendar.set(year,month,date,14,15);
                upToFirebase();
                break;
            case R.id.btnTime14_30 :
                calendar.set(year,month,date,14,30);
                upToFirebase();
                break;
            case R.id.btnTime14_45 :
                calendar.set(year,month,date,14,45);
                upToFirebase();
                break;

            case R.id.btnTime15_00 :
                calendar.set(year,month,date,15,00);
                break;
            case R.id.btnTime15_15 :
                calendar.set(year,month,date,15,15);
                upToFirebase();
                break;
            case R.id.btnTime15_30 :
                calendar.set(year,month,date,15,30);
                upToFirebase();
                break;
            case R.id.btnTime15_45 :
                calendar.set(year,month,date,15,45);
                upToFirebase();
                break;
            case R.id.btnTime16_00 :
                calendar.set(year,month,date,16,00);
                upToFirebase();
                break;
            case R.id.btnTime16_15 :
                calendar.set(year,month,date,16,15);
                upToFirebase();
                break;
            case R.id.btnTime16_30 :
                calendar.set(year,month,date,16,30);
                upToFirebase();
                break;
            case R.id.btnTime16_45 :
                calendar.set(year,month,date,16,45);
                upToFirebase();
                break;
        }
    }

    private void upToFirebase() {
        time = String.valueOf(calendar.getTime());
        Log.d("Date1", String.valueOf(time));

        

    }


}
