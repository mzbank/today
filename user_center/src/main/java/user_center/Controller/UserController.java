package user_center.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user")
    public String getUser(){
        return "zs";
    }

    @RequestMapping("/dream")
    public String realize(){
        return "l have already realize my dream! server port:8094";
    }
}
