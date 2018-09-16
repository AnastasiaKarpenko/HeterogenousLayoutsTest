package com.example.karpena2.heterogenouslayoutstest.Mock;

public class User {
    private String mName;
    private String mWhereFrom;

    public User(String name, String whereFrom) {
        mName = name;
        mWhereFrom = whereFrom;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getWhereFrom() {
        return mWhereFrom;
    }

    public void setWhereFrom(String whereFrom) {
        mWhereFrom = whereFrom;
    }
}
