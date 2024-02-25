package com.automating.k8s.k8sjenkinsawsautomationapp.service;

import com.automating.k8s.k8sjenkinsawsautomationapp.entity.Truck;
import com.automating.k8s.k8sjenkinsawsautomationapp.repository.ITruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckService {

    private final ITruckRepository truckRepository;

    @Autowired
    public TruckService(ITruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }

    public List<Truck> getTrucks() {
        return truckRepository.findAll();
    }

    public void createTruck(Truck truck) {
        truckRepository.save(truck);
    }

}
