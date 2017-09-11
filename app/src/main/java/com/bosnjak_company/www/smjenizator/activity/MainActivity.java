package com.bosnjak_company.www.smjenizator.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.bosnjak_company.www.smjenizator.R;
import com.bosnjak_company.www.smjenizator.adapter.ShiftAdapter;
import com.bosnjak_company.www.smjenizator.animations.SimpleDividerItemDecoration;
import com.bosnjak_company.www.smjenizator.common.Patterns;
import com.bosnjak_company.www.smjenizator.data.Shifts;
import com.github.sundeepk.compactcalendarview.CompactCalendarView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private ShiftAdapter mAdapter;
    private List<Shifts> mShiftsList;
    private Toolbar mToolbar;
    private SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    private DateFormat mSimpleDateFormat1 = new SimpleDateFormat("EEEE", new Locale("hr", "HR"));
    private Calendar mCalendar = Calendar.getInstance();

    //default Shift pattern
    private final List<String> mStartingShiftPattern = Arrays.asList("Noćna", "Slobodan", "Slobodan", "Jutarnja", "Jutarnja", "Dnevna", "Dnevna", "Noćna");

    @BindView(R.id.main_view)
    RecyclerView mRecyclerView;

    @BindView(R.id.compactcalendar_view)
    CompactCalendarView mCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mCalendarView.setVisibility(View.GONE);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        mShiftsList = new ArrayList<>();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mAdapter = new ShiftAdapter(this, mShiftsList);

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.addItemDecoration(new SimpleDividerItemDecoration(this));
        mRecyclerView.setAdapter(mAdapter);

        checkShifts();
    }

    private void checkShifts() {

        java.util.Date d = null;
        java.util.Date d1 = null;

        try {
            d = mSimpleDateFormat.parse("24.08.2017 ");
            d1 = mSimpleDateFormat.parse(mSimpleDateFormat.format(mCalendar.getTime()));
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }

        int diffInDays = (int) ((d.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));

        Collections.rotate(mStartingShiftPattern, diffInDays);
        String dayOne = mStartingShiftPattern.get(0);
        String dayTwo = mStartingShiftPattern.get(1);

        switch (dayOne) {
            case "Noćna":
                if (dayTwo.equals("Noćna")) {
                    prepareShifts(Patterns.shiftPatternOne, Patterns.picturesPatternOne);
                } else if (dayTwo.equals("Slobodan")) {
                    prepareShifts(Patterns.shiftPatternTwo, Patterns.picturesPatternTwo);
                }
            case "Slobodan":
                if (dayTwo.equals("Slobodan")) {
                    prepareShifts(Patterns.shiftPatternThree, Patterns.picturesPatternThree);
                } else if (dayTwo.equals("Jutarnja")) {
                    prepareShifts(Patterns.shiftPatternFour, Patterns.picturesPatternFour);
                }
            case "Jutarnja":
                if (dayTwo.equals("Jutarnja")) {
                    prepareShifts(Patterns.shiftPatternFive, Patterns.picturesPatternFive);
                } else if (dayTwo.equals("Dnevna")) {
                    prepareShifts(Patterns.shiftPatternSix, Patterns.picturesPatternSix);
                }
            case "Dnevna":
                if (dayTwo.equals("Dnevna")) {
                    prepareShifts(Patterns.shiftPatternSeven, Patterns.picturesPatternSeven);
                } else if (dayTwo.equals("Noćna")) {
                    prepareShifts(Patterns.shiftPatternEight, Patterns.picturesPatternEight);
                }
        }

    }

    private void prepareShifts(ArrayList<String> shift, int[] shiftPictures) {

        ArrayList<String> allDates = new ArrayList<>();
        ArrayList<String> allDays = new ArrayList<>();
        ArrayList<String> allShifts = new ArrayList<>();
        ArrayList<Integer> shiftPicturesArray = new ArrayList<>();

        //Populate allDates
        for (int i = 0; i < 30; i++) {
            allDates.add(mSimpleDateFormat.format(mCalendar.getTime()));
            allDays.add(mSimpleDateFormat1.format(mCalendar.getTime()));
            mCalendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        //Populate allShifts Array
        for (int i = 0; i <30; i++){
            for (String j: shift){
                allShifts.add(j);
            }
        }

        //populate shiftPicture Array
        for (int i = 0; i < 30; i++) {
            for (int j : shiftPictures) {
                shiftPicturesArray.add(j);
            }
        }

        //Create the recyclerView
        for (int i = 0; i < 30; i++) {
            Shifts shifts = new Shifts(allShifts.get(i), allDates.get(i), allDays.get(i),shiftPicturesArray.get(i));
            mShiftsList.add(shifts);
        }

        mAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.calendar) {
            if (mCalendarView.getVisibility() == View.VISIBLE) {
                mCalendarView.setVisibility(View.GONE);
            } else if (mCalendarView.getVisibility() == View.GONE) {
                mCalendarView.setVisibility(View.VISIBLE);
            }

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
