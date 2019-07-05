package product_center.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "USER_CENTER")
@Component
public interface RemoteService {

    @RequestMapping("/user")
    String getUser();
}
