package ufrn.imd.servicebeta1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beta")
public class BetaController {
    @Value("${server.port}") private int serverPort;
    @GetMapping
    public ResponseEntity listStudents() {
        return ResponseEntity.ok("OK from "+serverPort);
    }
}
