package com.jaellysbales.horoscope.ui;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.DatePicker;

import com.jaellysbales.horoscope.R;

import java.util.Calendar;

/**
 * Created by jaellysbales on 5/10/15.
 */
public class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);

        // TODO: Figure out if year option can be removed.
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        // Do something with the date chosen by the user
        String sign = null;
        String description = null;
        String startDate = null;
        String endDate = null;
        String profile = null;

        if (month == 0) {
            if (day <= 20) {
                sign = getString(R.string.sign_capricorn);
                description = getString(R.string.desc_capricorn);
                startDate = getString(R.string.start_date_capricorn);
                endDate = getString(R.string.end_date_capricorn);
                profile = getString(R.string.profile_capricorn);
            }
            else {
                sign = getString(R.string.sign_aquarius);
                description = getString(R.string.desc_aquarius);
                startDate = getString(R.string.start_date_aquarius);
                endDate = getString(R.string.end_date_aquarius);
                profile = getString(R.string.profile_aquarius);
            }
        }
        else if (month == 1) {
            if (day <= 21) {
                // There has to be a more concise way of setting this. It's 2x the code now.
                sign = getString(R.string.sign_aquarius);
                description = getString(R.string.desc_aquarius);
                startDate = getString(R.string.start_date_aquarius);
                endDate = getString(R.string.end_date_aquarius);
                profile = getString(R.string.profile_aquarius);
            }
            else {
                sign = getString(R.string.sign_pisces);
                description = getString(R.string.desc_pisces);
                startDate = getString(R.string.start_date_pisces);
                endDate = getString(R.string.end_date_pisces);
                profile = getString(R.string.profile_pisces);
            }
        }
        else if (month == 2) {
            if (day <= 20) {
                sign = getString(R.string.sign_pisces);
                description = getString(R.string.desc_pisces);
                startDate = getString(R.string.start_date_pisces);
                endDate = getString(R.string.end_date_pisces);
                profile = getString(R.string.profile_pisces);
            }
            else {
                sign = getString(R.string.sign_aries);
                description = getString(R.string.desc_aries);
                startDate = getString(R.string.start_date_aries);
                endDate = getString(R.string.end_date_aries);
                profile = getString(R.string.profile_aries);
            }
        }
        else if (month == 3) {
            if (day <= 19) {
                sign = getString(R.string.sign_aries);
                description = getString(R.string.desc_aries);
                startDate = getString(R.string.start_date_aries);
                endDate = getString(R.string.end_date_aries);
                profile = getString(R.string.profile_aries);
            }
            else {
                sign = getString(R.string.sign_taurus);
                description = getString(R.string.desc_taurus);
                startDate = getString(R.string.start_date_taurus);
                endDate = getString(R.string.end_date_taurus);
                profile = getString(R.string.profile_taurus);
            }
        }
        else if (month == 4) {
            if (day <= 20) {
                sign = getString(R.string.sign_taurus);
                description = getString(R.string.desc_taurus);
                startDate = getString(R.string.start_date_taurus);
                endDate = getString(R.string.end_date_taurus);
                profile = getString(R.string.profile_taurus);
            }
            else {
                sign = getString(R.string.sign_gemini);
                description = getString(R.string.desc_gemini);
                startDate = getString(R.string.start_date_gemini);
                endDate = getString(R.string.end_date_gemini);
                profile = getString(R.string.profile_gemini);
            }
        }
        else if (month == 5) {
            if (day <= 21) {
                sign = getString(R.string.sign_gemini);
                description = getString(R.string.desc_gemini);
                startDate = getString(R.string.start_date_gemini);
                endDate = getString(R.string.end_date_gemini);
                profile = getString(R.string.profile_gemini);
            }
            else {
                sign = getString(R.string.sign_cancer);
                description = getString(R.string.desc_cancer);
                startDate = getString(R.string.start_date_cancer);
                endDate = getString(R.string.end_date_cancer);
                profile = getString(R.string.profile_cancer);
            }
        }
        else if (month == 6) {
            if (day <= 22) {
                sign = getString(R.string.sign_cancer);
                description = getString(R.string.desc_cancer);
                startDate = getString(R.string.start_date_cancer);
                endDate = getString(R.string.end_date_cancer);
                profile = getString(R.string.profile_cancer);
            }
            else {
                sign = getString(R.string.sign_leo);
                description = getString(R.string.desc_leo);
                startDate = getString(R.string.start_date_leo);
                endDate = getString(R.string.end_date_leo);
                profile = getString(R.string.profile_leo);
            }
        }
        else if (month == 7) {
            if (day <= 22) {
                sign = getString(R.string.sign_leo);
                description = getString(R.string.desc_leo);
                startDate = getString(R.string.start_date_leo);
                endDate = getString(R.string.end_date_leo);
                profile = getString(R.string.profile_leo);
            }
            else {
                sign = getString(R.string.sign_virgo);
                description = getString(R.string.desc_virgo);
                startDate = getString(R.string.start_date_virgo);
                endDate = getString(R.string.end_date_virgo);
                profile = getString(R.string.profile_virgo);
            }
        }
        else if (month == 8) {
            if (day <= 22) {
                sign = getString(R.string.sign_virgo);
                description = getString(R.string.desc_virgo);
                startDate = getString(R.string.start_date_virgo);
                endDate = getString(R.string.end_date_virgo);
                profile = getString(R.string.profile_virgo);
            }
            else {
                sign = getString(R.string.sign_libra);
                description = getString(R.string.desc_libra);
                startDate = getString(R.string.start_date_libra);
                endDate = getString(R.string.end_date_libra);
                profile = getString(R.string.profile_libra);
            }
        }
        else if (month == 9) {
            if (day <= 23) {
                sign = getString(R.string.sign_libra);
                description = getString(R.string.desc_libra);
                startDate = getString(R.string.start_date_libra);
                endDate = getString(R.string.end_date_libra);
                profile = getString(R.string.profile_libra);
            }
            else {
                sign = getString(R.string.sign_scorpio);
                description = getString(R.string.desc_scorpio);
                startDate = getString(R.string.start_date_scorpio);
                endDate = getString(R.string.end_date_scorpio);
                profile = getString(R.string.profile_scorpio);
            }
        }
        else if (month == 10) {
            if (day <= 20) {
                sign = getString(R.string.sign_scorpio);
                description = getString(R.string.desc_scorpio);
                startDate = getString(R.string.start_date_scorpio);
                endDate = getString(R.string.end_date_scorpio);
                profile = getString(R.string.profile_scorpio);
            }
            else {
                sign = getString(R.string.sign_sagittarius);
                description = getString(R.string.desc_sagittarius);
                startDate = getString(R.string.start_date_sagittarius);
                endDate = getString(R.string.end_date_sagittarius);
                profile = getString(R.string.profile_sagittarius);
            }
        }
        else if (month == 11) {
            if (day <= 22) {
                sign = getString(R.string.sign_sagittarius);
                description = getString(R.string.desc_sagittarius);
                startDate = getString(R.string.start_date_sagittarius);
                endDate = getString(R.string.end_date_sagittarius);
                profile = getString(R.string.profile_sagittarius);
            }
            else {
                sign = getString(R.string.sign_capricorn);
                description = getString(R.string.desc_capricorn);
                startDate = getString(R.string.start_date_capricorn);
                endDate = getString(R.string.end_date_capricorn);
                profile = getString(R.string.profile_capricorn);
            }
        }

        FragmentActivity hostActivity = DatePickerFragment.this.getActivity();
        FragmentManager fragmentManager = hostActivity.getSupportFragmentManager();

        Fragment fragment = new ProfileSignFragment();
        Bundle args = new Bundle();
        args.putString("SIGN", sign);
        args.putString("DESCRIPTION", description);
        args.putString("STARTDATE", startDate);
        args.putString("ENDDATE", endDate);
        args.putString("PROFILE", profile);
        fragment.setArguments(args);

        fragmentManager.
                beginTransaction().
                replace(R.id.container_body, fragment).
                commit();
    }
}