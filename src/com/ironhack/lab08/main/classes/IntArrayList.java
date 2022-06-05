package com.ironhack.lab08.main.classes;

import com.ironhack.lab08.main.interfaces.IntList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class IntArrayList implements IntList {

    ArrayList<Integer> arrList = new ArrayList<Integer>(10);

    @Override
    public void add() throws IOException {

        if(arrlist.size() < 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please introduce a number");
            arrList.add(int arrList = scanner.nextLine());
        } else {

             ArrayList<ArrayList<Integer>> arrList2 = new ArrayList<>(15);
             arrList2.add(arrList);
             Scanner scanner = new Scanner(System.in);
             System.out.println("Please introduce a number");
             arrList.add(int arrList = scanner.nextLine());

            }

    }

    @Override
    public void get() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce a number");
        arrlist.get(int arrList = scanner.nextLine());{
    }
}
