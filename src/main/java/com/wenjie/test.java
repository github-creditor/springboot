package com.wenjie;


/*
*       字符串的特点
*
* */


public class test {

    String str=new String("good");
    char[] ch={'t','e','s','t'};

    public void change(String str,char[] ch){
        str=new String("test ok");
        ch[0]='b';
        System.out.println(str);

    }


    public static void main(String[] args) {

        test test=new test();
        test.change(test.str,test.ch);

        System.out.println(test.str);
        System.out.println(test.ch);

    }
}
