package bts.sio.azurimmo.controller;

import bts.sio.azurimmo.model.Garant;
import bts.sio.azurimmo.service.GarantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/garants")
public class GarantController {

    @Autowired
    private GarantService garantService;

    @GetMapping("/")
    public List<Garant> getAllGarants() {
        return garantService.getAllGarants();
    }

    @GetMapping("/{id}")
    public Garant getGarantById(@PathVariable Long id) {
        return garantService.getGarantById(id);
    }

}
