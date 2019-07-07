package product_center.api.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import product_center.api.RemoteService;

@Component
public class RemoteServiceImpl implements FallbackFactory<RemoteService> {


//    @Override
//    public String getUser() {
//        return null;
//    }
//
//    @Override
//    public String realize() {
//        return "l'm come from fallback!";
//    }

    @Override
    public RemoteService create(Throwable throwable) {
        return new RemoteService() {

            @Override
            public String realize() {
                return "l'm from fallback!";
            }
        };
    }
}
