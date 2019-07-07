package product_center.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import product_center.service.RemoteServiveImpl;

@RestController
public class RemoteController {

    @Autowired
    private RemoteServiveImpl servive;



    @RequestMapping("/gg")
    public String name(){
        return "dfsdf";
    }

    @RequestMapping("/realize")
    public String realize(){
        String realize = servive.realize();
        return realize;
    }

}
