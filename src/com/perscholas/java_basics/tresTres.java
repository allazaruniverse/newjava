package com.perscholas.java_basics;

public class tresTres {

    //declare two integer variables
    //exercise one
    int uno;
    int dos;
    int sum1;

    //exercise two
    double tres;
    double quatro;
    double sum2;

    //exercie three
    int one;
    double two;
    double sum3; //has to be double for the decimals from "two"


    public void add() {
        //assign an integer to each
        uno = 11;
        dos = 10;

        //assign the sum to a variable
        sum1 = uno + dos;

        //Print out the result
        System.out.println(sum1);
    }

    public void dub(){
        tres = 23.67;
        quatro = 45.01;

        sum2 = tres + quatro;

        System.out.println(sum2);
    }

    public void mix(){
        one = 88;
        two = 12.45;

        sum3 = one + two;

        System.out.println(sum3);
    }

    public void div1(){
        uno = 24;
        dos = 48;

        sum1 = uno / dos;

        System.out.println(sum1);
    }

    public void div2(){
        uno = 24;
        dos = 48;

        sum1 = dos / uno;

        System.out.println(sum1);
    }

    public void dubdiv(){
        tres = 24;
        quatro = 48;

        sum2 = quatro / tres;

        System.out.println(sum2);
    }

    public void intdiv(){
        tres = 24;
        quatro = 48;

        sum1 = (int) (quatro / tres);

        System.out.println(sum1);
    }
    public void vanilla(){
        int x = 5;
        int y = 6;

         int q = y/x;
        System.out.println(q);

    }
    public void vanilla2(){
        int x = 5;
        int y = 6;
        double q = (double) (y / x);
        System.out.println(q);
    }
    }
