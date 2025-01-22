package ufrn.imd.service;

import ufrn.imd.model.Alpha;
import ufrn.imd.model.Beta;
import ufrn.imd.client.AlphaClient;
import ufrn.imd.client.BetaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompositeService {

    @Autowired
    private AlphaClient alphaClient;

    @Autowired
    private BetaClient betaClient;

    public List<Alpha> getAllAlphas() {
        return alphaClient.getAllAlphas();
    }

    public List<Beta> getAllBetas() {
        return betaClient.getAllBetas();
    }

    public Alpha createAlpha(Alpha alpha) {
        return alphaClient.createAlpha(alpha);
    }

    public Beta createBeta(Beta beta) {
        return betaClient.createBeta(beta);
    }
}