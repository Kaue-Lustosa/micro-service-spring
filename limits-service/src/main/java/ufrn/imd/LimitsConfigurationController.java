package ufrn.imd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    public LimitsConfigurationController() {
        // TODO Auto-generated constructor stub
    }

    @GetMapping("/limits")
    public LimitsConfigurationController retrieveLimits;

    public LimitsConfigurationController(int maximum, int minimum) {
    }

    Object FromConfigurations() {
        return new LimitsConfigurationController(configuration.getMaximum(), configuration.getMinimum());
    }
}