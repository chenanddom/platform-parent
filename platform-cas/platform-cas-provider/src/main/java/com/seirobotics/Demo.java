package com.seirobotics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {

    public static void main(String[] args) {


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(new Date(System.currentTimeMillis())));

    }
}
