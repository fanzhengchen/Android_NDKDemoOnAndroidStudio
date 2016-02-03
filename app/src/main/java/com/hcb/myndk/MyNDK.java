package com.hcb.myndk;

/**
 * Created by fanzhengchen on 2/3/16.
 */
public class MyNDK {

    static {
        System.loadLibrary("MyLibrary");
    }

    public native String getMyString();
}
