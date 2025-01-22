package com.hloong.intelligallery;

import com.hloong.intelligallery.config.CosClientConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
@EnableConfigurationProperties(CosClientConfig.class)
@MapperScan("com.hloong.intelligallery.mapper")
public class IntelliGalleryApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntelliGalleryApplication.class, args);
    }

}
