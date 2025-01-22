package ufrn.imd.servicebeta;

import org.springframework.web.bind.annotation.*;
import ufrn.imd.model.Beta;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/beta")
public class BetaController {

    private final List<Beta> betas = new ArrayList<>();

    // GET - Retorna todos os betas
    @GetMapping
    public List<Beta> getAllBetas() {
        return betas;
    }

    // POST - Cria um novo beta
    @PostMapping
    public Beta createBeta(@RequestBody Beta beta) {
        betas.add(beta);
        return beta;
    }
}
