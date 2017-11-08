package khemathatcom.calendar.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import khemathatcom.calendar.R;
import khemathatcom.calendar.fragment.calendarFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null){
            //เปลี่ยนหน้า fragment
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, calendarFragment.newInstance())
                    .commit();
        }


    }


}
