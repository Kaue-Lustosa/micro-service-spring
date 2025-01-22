package ufrn.imd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ufrn.imd.client.AlphaClient;
import ufrn.imd.client.BetaClient;
import ufrn.imd.model.Alpha;
import ufrn.imd.model.Beta;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/composite")
public class CompositeController {

    @Autowired
    private AlphaClient alphaClient;

    @Autowired
    private BetaClient betaClient;

    // Operação de leitura agregada (unindo dados de Alpha e Beta)
    @GetMapping("/all")
    public List<Object> getAll() {
        List<Alpha> alphas = alphaClient.getAllAlphas();
        List<Beta> betas = betaClient.getAllBetas();
        return Stream.concat(alphas.stream(), betas.stream()).collect(Collectors.toList());
    }

    // Operação de criação agregada para Alpha
    @PostMapping("/alphas")
    public Alpha createAlpha(@RequestBody Alpha alpha) {
        return alphaClient.createAlpha(alpha);
    }

    // Operação de criação agregada para Beta
    @PostMapping("/betas")
    public Beta createBeta(@RequestBody Beta beta) {
        return betaClient.createBeta(beta);
    }
}