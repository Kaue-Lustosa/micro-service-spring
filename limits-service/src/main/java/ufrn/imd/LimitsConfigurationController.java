package ufrn.imd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ufrn.imd.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    public LimitsConfigurationController() {
        // TODO Auto-generated constructor stub
    }

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimits; Object FromConfigurations() {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}