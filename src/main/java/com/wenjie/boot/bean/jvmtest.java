package com.wenjie.boot.bean;
public class jvmtest {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("测试");
        long l = Runtime.getRuntime().maxMemory();
        System.out.println(l/1024/1024+"mb");
        long l1 = Runtime.getRuntime().totalMemory();
        System.out.println(l1/1024/1024+"mb");

        System.out.println("       " +
                "-XX:newRatio   设置新生区和养老区的比例" +
                "-XX:survivorRatio   设置Eden空间和survivor空间的比例 " +
                "-XX：-useadaptiveSizePolicy 关闭自动设置eden空间的大小   " +
                " -Xmn 设置新生区内存大小" +
                "" +
                "" +
                "" +
                "" +
                "");

        Thread.sleep(10000000);
    }
}
