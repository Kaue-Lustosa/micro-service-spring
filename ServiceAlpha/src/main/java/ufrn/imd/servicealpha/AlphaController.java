package ufrn.imd.servicealpha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufrn.imd.servicebeta1.BetaServiceInterface;

@RestController
@RequestMapping("/alpha")
public class AlphaController {
    @Autowired
    BetaServiceInterface betaservice;

    @GetMapping
    public ResponseEntity getData(){
        return ResponseEntity.ok(betaservice.getData());
    }
}