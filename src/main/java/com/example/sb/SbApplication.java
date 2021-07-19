package com.example.sb;

import com.example.sb.bean.ConfigBean;
import com.example.sb.bean.TestConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class, TestConfigBean.class})
public class SbApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SbApplication.class);
        app.setAddCommandLineProperties(false);
        app.run(args);
    }

}
