package com.example.danhnhan;

import java.io.Serializable;

public class DanhNhan implements Serializable {
    private String name;
    private String Date;
    private String Born;
    private String Description;
    private int Image;

    public DanhNhan(String name, String date, String born, String description, int image) {
        this.name = name;
        Date = date;
        Born = born;
        Description = description;
        Image = image;
    }

    //    public DanhNhan(String name, String description, int image) {
//        this.name = name;
//        Description = description;
//        Image = image;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getBorn() {
        return Born;
    }

    public void setBorn(String born) {
        Born = born;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
