package product_center.config_controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${config}")
    String config;

    @RequestMapping(value = "config")
    public String gitProfile(){
        return config;
    }
}
