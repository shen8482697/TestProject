package com.git.test;

import java.util.Map;

public class GitDemo {
    static {
        System.out.println("121321");
        System.out.println("测试分支1");
    }
    public static void main(String[] args) {
        System.out.println(GitDemo.getTest());
    }




    public static int getTest(){
        return 1;
    }
}
