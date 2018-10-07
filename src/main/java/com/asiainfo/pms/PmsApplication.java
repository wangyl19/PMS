package com.asiainfo.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.asiainfo.pms.**.dao")
//打war包需要继承SpringBootServletInitializer
public class PmsApplication extends SpringBootServletInitializer {

    @Override
    //重写configure()方法
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PmsApplication.class);
    }

    /*外部tomcat不需要main方法来启动w
    public static void main(String[] args) {
        SpringApplication.run(PmsApplication.class, args);
    }
    */

}
