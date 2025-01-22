package ufrn.imd.netflixeurekanamingserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery. DiscoveryClient;
import org.springframework.stereotype.Component;
import java.util.Iterator;
import java.util.List;

@Component
public class BetaRestTemplateClient {
    @Autowired
    private DiscoveryClient discoveryClient;
    public void listBetaServices () {
        List<ServiceInstance> instances = discoveryClient.getInstances ("SERVICEBETA"); if (instances.isEmpty())
            return;
        for (Iterator iterator = instances.iterator(); iterator.hasNext(); ) { ServiceInstance serviceInstance = (ServiceInstance) iterator.next(); System.out.println(serviceInstance.getHost() + ":" + serviceInstance.getPort());
        }
    }
}