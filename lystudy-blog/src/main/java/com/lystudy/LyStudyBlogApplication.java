package com.lystudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author luyoung
 * @time 2023-10-02 21:01
 */
@SpringBootApplication
@MapperScan("com.lystudy.mapper")
public class LyStudyBlogApplication {
    public static void main(String[] args) {

        SpringApplication.run(LyStudyBlogApplication.class);
    }
}
