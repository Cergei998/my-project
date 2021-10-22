package com.company;

public class Main {

    public static void main(String[] args) {
        int result1 = 1;
        int result2 = 1;
        int bet1 = 1;
        int bet2 = 1;
        int res = 0;
        res = bet1 > bet2 && result1 > result2
                ? 1 : 0;    // 1-st win
        res = bet1 > bet2 && bet1 == result1 && bet2 == result2
                ? 2 : 0;    // 1-st win score ++

        res = bet2 > bet1 && result2 > result1
                ? 1 : 0;    // 2-nd win
        res = bet2 > bet1 && bet1 == result1 && bet2 == result2
                ? 2 : 0;    // 2-nd win score ++

        res = bet1 == bet2 && result1 == result2
                ? 1 : 0;     // draw
        res = bet1 == bet2 && bet1 == result1 && bet1 == result2
                ? 2 : 0;     // draw ++
        res = result1 == result2 && result1 > bet1 && result1 > bet2
                ? 1 : 0;     // draw
        System.out.println(res);
    }
}
