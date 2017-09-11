package com.bosnjak_company.www.smjenizator.data;

public class Shifts {

    private String shift;
    private String date;
    private String day;
    int photoId;

    public Shifts(String shift, String date, String day, int photoId) {
        this.shift = shift;
        this.date = date;
        this.day = day;
        this.photoId = photoId;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
