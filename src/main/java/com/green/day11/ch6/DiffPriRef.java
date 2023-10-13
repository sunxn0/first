package com.green.day11.ch6;

public class DiffPriRef {
    public static void main(String[] args) {
        int num = 30;
        System.out.println("num : " + num);

        NumBox nb = new NumBox();
        nb.num = 100;
        nb.num = 200;
        nb = new NumBox();
        System.out.println("(1)nb.num : " + nb.num);
        nb.num = 30;
        System.out.println("(2)nb.num : " + nb.num);
        changeVal(nb);
        System.out.println("(3)nb.num : " + nb.num);
    }
    public static void changeVal(int num) {
        System.out.println("changeVal - int");
        num = 10;
    }
    public static void changeVal(NumBox dd) {
        System.out.println("changeVal - NumBox");
        dd.num = 10;
    }
}
class NumBox {
    int num;
}
