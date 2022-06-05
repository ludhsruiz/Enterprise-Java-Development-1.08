package com.ironhack.lab08.main;

import com.ironhack.lab08.main.interfaces.IntList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Main {

    public static BigDecimal main(String[] args){

        // BiG DECIMALS 1&2
        BigDecimal firstBig = new BigDecimal("");
        BigDecimal result1 = firstBig.doubleValue().setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal result2 = firstBig.negate().setScale(1, RoundingMode.HALF_UP);

    }

}

