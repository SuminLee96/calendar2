package com.example.calendar2;

import android.app.Activity;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class calendarActivity extends Activity {
    private TextView tvDate;
    private GridAdapter gridAdapter;
    private ArrayList<String> dayList;
    private GridView gridView;
    private Calendar mCal;

    @Override
    protected void onCreate(Bundle savedinstanceState) {
        super.onCreate(savedinstanceState);

        setContentView(R.layout.activity_calendar);

        tvDate = (TextView)findViewById(R.id.tv_date);
        gridView = (GridView)findViewById(R.id.gridview);

        long now = System.currentTimeMillis();
        final Date date = new Date(now);
        final SimpleDateFormat curYearFormat = new SimpleDateFormat("yyyy", Locale.KOREA);
        final SimpleDateFormat curMonthFormat = new SimpleDateFormat("MM",Locale.KOREA);
        final SimpleDateFormat curDayFormat = new SimpleDateFormat("dd", Locale.KOREA);

        tvDate.setText(curYearFormat.format(date)+"/"+curMonthFormat.format(date));

        dayList = new ArrayList<String>();

        dayList.add("일");

        dayList.add("월");

        dayList.add("화");

        dayList.add("수");

        dayList.add("목");

        dayList.add("금");

        dayList.add("토");

        mCal = Calendar.getInstance();

        mCal.set(Integer.parseInt(curYearFormat.format(date)), Integer.parseInt(curMonthFormat.format(date))-1,1);
        int dayNum = mCal.get()








    }

}

public class calendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
    }
}

//뿡뿡
