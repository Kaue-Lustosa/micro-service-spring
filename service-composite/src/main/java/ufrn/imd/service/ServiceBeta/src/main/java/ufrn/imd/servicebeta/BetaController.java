package ufrn.imd.servicebeta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufrn.imd.model.Beta;

import java.util.List;

@RestController
@RequestMapping("/beta")
public class BetaController {
    @Value("${server.port}") private int serverPort;
    @GetMapping
    public ResponseEntity listStudents() {
        return ResponseEntity.ok("OK from "+serverPort);
    }

    @Autowired
    private ServiceBetaApplication betaService;

    @GetMapping
    public List<Beta> getAllBetas() {
        return betaService.getAllBetas();
    }

    @PostMapping
    public Beta createBeta(@RequestBody Beta beta) {
        return betaService.createBeta(beta);
    }
}
