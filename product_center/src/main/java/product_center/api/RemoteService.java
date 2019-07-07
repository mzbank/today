package product_center.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import product_center.api.fallback.RemoteServiceImpl;

@FeignClient(value = "USER-CENTER",fallbackFactory = RemoteServiceImpl.class)
public interface RemoteService {

    @RequestMapping("/dream")
    String realize();
}
