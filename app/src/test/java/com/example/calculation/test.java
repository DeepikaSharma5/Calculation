package com.example.calculation;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;

public class test {
    static MainActivity2 mainActivity2;
    private double no1,no2,no3,no4,m,no5,no6,no7,no8,result,result1,result2,result3;

    @BeforeClass
    public static void CreateObject(){
        mainActivity2 = new MainActivity2();
    }

    @Before
    public void getAmount(){
        m = 75.0/100.0;

        no1 = 100;
        no2 = no1*m;
        result = no2;

        no3 = 1000;
        no4 = no3 * m;
        result1 = no4;

        no5 = 356;
        no6 = no5 * m;
        result2 = no6;

        no7 = 274596;
        no8 = no7 * m;
        result3 = no8;

    }

    @Test
    public void testTotalAmount(){
        assertEquals(75.0,result,0);
        assertEquals(750.0,result1,0);
        assertEquals(267.0,result2,0);
        assertEquals(205947,result3,0);
    }

    @After
    public void clearData(){
        result=0;
        result1=0;
    }

    @AfterClass
    public static void deleteObject(){
        mainActivity2 = null;
    }


}
