package ufrn.imd.servicebeta;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import ufrn.imd.model.Beta;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceBetaApplication {
    private final List<Beta> betas = new ArrayList<>();
    public List<Beta> getAllBetas() {
        return betas;
    }

    public Beta createBeta(Beta beta) {
        betas.add(beta);
        return beta;

    }
}

