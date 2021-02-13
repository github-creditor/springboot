package com.wenjie;

public class test02 {

    public static void main(String[] args) {



        order o=null;
        o.hello();

        System.out.println(o.count);

    }

    static class order{

        public static int count=1;
        public static final int number=2;

        public static void hello(){
            System.out.println("hello");
        }

    }

}
