package ufrn.imd.servicebeta;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("servicebeta")
public class BetaServiceInterface {
    @RequestMapping(method = RequestMethod.GET, value = "/beta", consumes = "application/json")
    public String getData() {
        return null;
    }
}