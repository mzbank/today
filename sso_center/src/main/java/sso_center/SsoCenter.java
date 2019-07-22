package sso_center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SsoCenter {

    public static void main(String[] args) {
        SpringApplication.run(SsoCenter.class, args);
    }
}
