package com.hdax.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitdemoApplication.class, args);
        System.out.println("hellogit");
        System.out.println("你好呀 git  第一个版本");
        System.out.println("你好呀 git  第二个版本");
        System.out.println("你好呀 git  第三个版本");
        System.out.println("hot-fix 分支合并");
    }

}
