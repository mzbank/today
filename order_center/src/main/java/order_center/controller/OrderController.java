package order_center.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @RequestMapping("/dream")
    public String realize(){
        return "l'm from service order_center server port:8095";
    }
}
