package com.ensk.demo.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        // 访问UI地址 http://127.0.0.1:8080/swagger-ui.html
        // 访问json文档地址 http://127.0.0.1:8080/v2/api-docs
        // 访问打印错误日志是因为Swagger对Integer支持很辣鸡
    }

}
