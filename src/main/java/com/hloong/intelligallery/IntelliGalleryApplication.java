package com.hloong.intelligallery;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hloong.intelligallery.mapper")
public class IntelliGalleryApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntelliGalleryApplication.class, args);
    }

}
