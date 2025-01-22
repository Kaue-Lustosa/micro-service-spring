package ufrn.imd.servicealpha;

import ufrn.imd.model.Alpha;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/alpha")
public class AlphaController {

    private final List<Alpha> alphas = new ArrayList<>();

    // GET - Retorna todos os alphas
    @GetMapping
    public List<Alpha> getAllAlphas() {
        return alphas;
    }

    // POST - Cria um novo alpha
    @PostMapping
    public Alpha createAlpha(@RequestBody Alpha alpha) {
        alphas.add(alpha);
        return alpha;
    }
}