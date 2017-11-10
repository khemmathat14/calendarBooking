package khemathatcom.calendar.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.Toast;

import com.applandeo.materialcalendarview.EventDay;
import com.applandeo.materialcalendarview.listeners.OnDayClickListener;


import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import khemathatcom.calendar.R;


/**
 * Created by nuuneoi on 11/16/2014.
 */
public class calendarFragment extends Fragment {

    public calendarFragment() {
        super();
    }

    public static calendarFragment newInstance() {
        calendarFragment fragment = new calendarFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calendar, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(final View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here
        final Calendar calendar = Calendar.getInstance();
        final com.applandeo.materialcalendarview.CalendarView
                calendarView = (com.applandeo.materialcalendarview.CalendarView) rootView.findViewById(R.id.calendar);

        calendarView.setOnDayClickListener(new OnDayClickListener() {
            @Override
            public void onDayClick(EventDay eventDay) {
                Date selectedDate = calendarView.getFirstSelectedDate().getTime();

                //Get Day-Month-Year
                int selectedDate2 = eventDay.getCalendar().get(Calendar.DAY_OF_MONTH);
                int selectedDate3 = eventDay.getCalendar().get(Calendar.MONTH);
                int selectedDate4 = eventDay.getCalendar().get(Calendar.YEAR);

                Log.d("date", String.valueOf(selectedDate));
                Log.d("date", String.valueOf(selectedDate2));
                Log.d("date", String.valueOf(selectedDate3));
                Log.d("date", String.valueOf(selectedDate4));

                calendar.setTime(selectedDate);

                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentContainer,timeFragment.newInstance(selectedDate2,
                                selectedDate3,selectedDate4))
                        .addToBackStack(null)
                        .commit();

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
