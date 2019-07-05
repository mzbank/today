package yesterday_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class YesterdayConfig {

    public static void main(String[] args) {
        SpringApplication.run(YesterdayConfig.class, args);
    }
}
