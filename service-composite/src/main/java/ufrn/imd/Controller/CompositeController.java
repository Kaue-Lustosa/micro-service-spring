package ufrn.imd.Controller;

import ufrn.imd.service.CompositeService;
import ufrn.imd.model.Alpha;
import ufrn.imd.model.Beta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/composite")
public class CompositeController {

    @Autowired
    private CompositeService compositeService;

    @GetMapping("/alpha")
    public List<Alpha> getAllAlphas() {
        return compositeService.getAllAlphas();
    }

    @GetMapping("/beta")
    public List<Beta> getAllBetas() {
        return compositeService.getAllBetas();
    }

    @PostMapping("/alpha")
    public Alpha createAlpha(@RequestBody Alpha alpha) {
        return compositeService.createAlpha(alpha);
    }

    @PostMapping("/beta")
    public Beta createBeta(@RequestBody Beta beta) {
        return compositeService.createBeta(beta);
    }
}