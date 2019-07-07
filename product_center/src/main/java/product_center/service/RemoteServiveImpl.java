package product_center.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product_center.api.RemoteService;

@Service
public class RemoteServiveImpl {

    @Autowired
    private RemoteService service;

    public String realize(){
        String realize = service.realize();
        return realize;
    }
}
