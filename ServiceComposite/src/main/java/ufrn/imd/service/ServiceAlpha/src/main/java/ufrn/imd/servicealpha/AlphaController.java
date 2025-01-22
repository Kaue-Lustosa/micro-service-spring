package ufrn.imd.servicealpha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufrn.imd.model.Alpha;
import ufrn.imd.servicebeta.BetaServiceInterface;

import java.util.List;

@RestController
@RequestMapping("/alpha")
public class AlphaController {
    BetaServiceInterface betaservice;

    @GetMapping
    public ResponseEntity getData(){
        return ResponseEntity.ok(betaservice.getData());
    }

    @Autowired
    private ServiceAlphaApplication alphaService;

    @GetMapping
    public List<Alpha> getAllAlphas() {
        return alphaService.getAllAlphas();
    }

    @PostMapping
    public Alpha createAlpha(@RequestBody Alpha alpha) {
        return alphaService.createAlpha(alpha);
    }
}