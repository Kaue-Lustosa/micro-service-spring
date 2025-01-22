package ufrn.imd.servicealpha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import ufrn.imd.model.Alpha;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceAlphaApplication {
    private final List<Alpha> alphas = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(ServiceAlphaApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    public List<Alpha> getAllAlphas() {
        return alphas;
    }

    public Alpha createAlpha(Alpha alpha) {
        alphas.add(alpha);
        return alpha;
    }
}