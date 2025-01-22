package ufrn.imd.client;

import ufrn.imd.model.Alpha;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "service-alpha")
public interface AlphaClient {

    @GetMapping("/alpha")
    List<Alpha> getAllAlphas();

    @PostMapping("/alpha")
    Alpha createAlpha(@RequestBody Alpha alpha);
}