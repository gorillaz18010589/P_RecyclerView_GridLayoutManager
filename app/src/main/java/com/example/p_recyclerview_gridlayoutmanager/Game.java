package com.example.p_recyclerview_gridlayoutmanager;

public class Game {
    public Game(String name, String value) {
        this.name = name;
        this.value = value;
    }

    String name;
    String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
