package com.bosnjak_company.www.smjenizator.common;

import com.bosnjak_company.www.smjenizator.R;

import java.util.ArrayList;
import java.util.Arrays;

public class Patterns {

    //Shift Pattern
    public static ArrayList<String> shiftPatternOne =
            new ArrayList<>(Arrays.asList("Noćna", "Noćna", "Slobodan", "Slobodan", "Jutarnja", "Jutarnja", "Dnevna", "Dnevna"));

    public static ArrayList<String> shiftPatternTwo =
            new ArrayList<>(Arrays.asList("Noćna", "Slobodan", "Slobodan", "Jutarnja", "Jutarnja", "Dnevna", "Dnevna", "Noćna"));

    public static ArrayList<String> shiftPatternThree =
            new ArrayList<>(Arrays.asList("Slobodan", "Slobodan", "Jutarnja", "Jutarnja", "Dnevna", "Dnevna", "Noćna", "Noćna"));

    public static ArrayList<String> shiftPatternFour =
            new ArrayList<>(Arrays.asList("Slobodan", "Jutarnja", "Jutarnja", "Dnevna", "Dnevna", "Noćna", "Noćna", "Slobodan"));

    public static ArrayList<String> shiftPatternFive =
            new ArrayList<>(Arrays.asList("Jutarnja", "Jutarnja", "Dnevna", "Dnevna", "Noćna", "Noćna", "Slobodan", "Slobodan"));

    public static ArrayList<String> shiftPatternSix =
            new ArrayList<>(Arrays.asList("Jutarnja", "Dnevna", "Dnevna", "Noćna", "Noćna", "Slobodan", "Slobodan", "Jutarnja"));

    public static ArrayList<String> shiftPatternSeven =
            new ArrayList<>(Arrays.asList("Dnevna", "Dnevna", "Noćna", "Noćna", "Slobodan", "Slobodan", "Jutarnja", "Jutarnja"));

    public static ArrayList<String> shiftPatternEight =
            new ArrayList<>(Arrays.asList("Dnevna", "Noćna", "Noćna", "Slobodan", "Slobodan", "Jutarnja", "Jutarnja", "Dnevna"));

    //pictures pattern
    public static int[] picturesPatternOne = {R.drawable.bole_nocna_1, R.drawable.bole_nocna_2, R.drawable.bole_slobodan_1, R.drawable.bole_slobodan_2,
            R.drawable.bole_jutarnja_1, R.drawable.bole_jutarnja_2, R.drawable.bole_dnevna_1, R.drawable.bole_dnevna_2};

    public static int[] picturesPatternTwo = {R.drawable.bole_nocna_2, R.drawable.bole_slobodan_1, R.drawable.bole_slobodan_2,
            R.drawable.bole_jutarnja_1, R.drawable.bole_jutarnja_2, R.drawable.bole_dnevna_1, R.drawable.bole_dnevna_2, R.drawable.bole_nocna_1};

    public static int[] picturesPatternThree = {R.drawable.bole_slobodan_1, R.drawable.bole_slobodan_2, R.drawable.bole_jutarnja_1,
            R.drawable.bole_jutarnja_2, R.drawable.bole_dnevna_1, R.drawable.bole_dnevna_2, R.drawable.bole_nocna_1, R.drawable.bole_nocna_2};

    public static int[] picturesPatternFour = {R.drawable.bole_slobodan_2, R.drawable.bole_jutarnja_1, R.drawable.bole_jutarnja_2,
            R.drawable.bole_dnevna_1, R.drawable.bole_dnevna_2, R.drawable.bole_nocna_1, R.drawable.bole_nocna_2, R.drawable.bole_slobodan_1};

    public static int[] picturesPatternFive = {R.drawable.bole_jutarnja_1, R.drawable.bole_jutarnja_2, R.drawable.bole_dnevna_1,
            R.drawable.bole_dnevna_2, R.drawable.bole_nocna_1, R.drawable.bole_nocna_2, R.drawable.bole_slobodan_1, R.drawable.bole_slobodan_2};

    public static int[] picturesPatternSix = {R.drawable.bole_jutarnja_2, R.drawable.bole_dnevna_1, R.drawable.bole_dnevna_2, R.drawable.bole_nocna_1,
            R.drawable.bole_nocna_2, R.drawable.bole_slobodan_1, R.drawable.bole_slobodan_2, R.drawable.bole_jutarnja_1};

    public static int[] picturesPatternSeven = {R.drawable.bole_dnevna_1, R.drawable.bole_dnevna_2, R.drawable.bole_nocna_1, R.drawable.bole_nocna_2,
            R.drawable.bole_slobodan_1, R.drawable.bole_slobodan_2, R.drawable.bole_jutarnja_1, R.drawable.bole_jutarnja_2};

    public static int[] picturesPatternEight = {R.drawable.bole_dnevna_2, R.drawable.bole_nocna_1, R.drawable.bole_nocna_2, R.drawable.bole_slobodan_1,
            R.drawable.bole_slobodan_2, R.drawable.bole_jutarnja_1, R.drawable.bole_jutarnja_2, R.drawable.bole_dnevna_1, };
}
