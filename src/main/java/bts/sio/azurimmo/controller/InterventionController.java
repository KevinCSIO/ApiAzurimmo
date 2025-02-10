package bts.sio.azurimmo.controller;

import bts.sio.azurimmo.model.Intervention;
import bts.sio.azurimmo.service.InterventionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interventions")
public class InterventionController {

    @Autowired
    private InterventionService interventionService;

    @GetMapping("/")
    public List<Intervention> getAllInterventions() {
        return interventionService.getAllInterventions();
    }

    @GetMapping("/{id}")
    public Intervention getInterventionById(@PathVariable Long id) {
        return interventionService.getInterventionById(id);
    }

}