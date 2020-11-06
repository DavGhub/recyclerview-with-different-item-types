package com.dav.myapplication;

public enum ProfileItemType{
    CATEGORY(1),
    SWITCHER(2),
    SPACE(3);

    final int value;

    ProfileItemType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
