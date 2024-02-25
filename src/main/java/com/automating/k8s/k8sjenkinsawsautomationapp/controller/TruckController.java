package com.automating.k8s.k8sjenkinsawsautomationapp.controller;

import com.automating.k8s.k8sjenkinsawsautomationapp.entity.Truck;
import com.automating.k8s.k8sjenkinsawsautomationapp.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/truck")
public class TruckController {

    private final TruckService truckService;

    @Autowired
    public TruckController(TruckService truckService) {
        this.truckService = truckService;
    }

    @GetMapping
    public List<Truck> getTrucks() {
        return truckService.getTrucks();
    }

    @PostMapping
    public void createTruck(@RequestBody Truck truck) {
        truckService.createTruck(truck);
    }
}
