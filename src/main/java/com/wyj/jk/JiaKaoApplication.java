package com.wyj.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wen.yijun
 * @Description
 * @date 2020/12/7
 */
@SpringBootApplication
@MapperScan("com.wyj.jk.mapper")
public class JiaKaoApplication {
    public static void main(String[] args) {
        SpringApplication.run(JiaKaoApplication.class,args);
    }
}
