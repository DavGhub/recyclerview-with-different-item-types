package com.dav.myapplication;

public class ProfileListItem {
    private  int imageRes;
    private String title;
    private ProfileItemType itemType;

    public ProfileListItem(int imageRes, String title, ProfileItemType itemType) {
        this.imageRes = imageRes;
        this.title = title;
        this.itemType = itemType;
    }

    public int getImageRes() {
        return imageRes;
    }

    public String getTitle() {
        return title;
    }

    public ProfileItemType getItemType() {
        return itemType;
    }
}
