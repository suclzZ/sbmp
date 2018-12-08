package com.sucl.sbmp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author sucl
 * @since 2018/12/8
 */
@SpringBootApplication
@MapperScan("com.sucl.sbmp.*.mapper")
@EnableTransactionManagement
public class MpStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpStartApplication.class,args);
    }

}
