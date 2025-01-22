package ufrn.imd.client;

import ufrn.imd.model.Beta;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "service-beta")
public interface BetaClient {

    @GetMapping("/beta")
    List<Beta> getAllBetas();

    @PostMapping("/beta")
    Beta createBeta(@RequestBody Beta beta);
}