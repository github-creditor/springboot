package com.wenjie;

public class test03 {




    public static void main(String[] args) {

        String str1=new String("hello");
        String str2="hello";
        String str3="hello";
        System.out.println(str1==str2);
        System.out.println(str2==str3);

        System.out.println("=============");


        int a=new Integer(1);
        int b=new Integer(1);

        System.out.println(a==b);


        System.out.println("===========");

        Integer c=new Integer(1000);
        Integer d=new Integer(1000);

        System.out.println(c==d);

        System.out.println("==============");

        /*
        *       在-128到127是相同的
        * */

        Integer e=10000;
        Integer f=10000;
        System.out.println(e==f);

        }

}
