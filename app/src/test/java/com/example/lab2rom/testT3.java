package com.example.lab2rom;
import android.content.pm.ComponentInfo;

import com.example.lab2rom.task3.*;

import org.junit.Test;

public class testT3 {
    @Test
    public void TestTaskThree(){

        Point p1 = new Point(1,3 );
        System.out.println(p1);

        Point p2 = new Point();

        Line l1 = new Line(1,3 ,3 ,4);
        System.out.println(l1);
    }

}
