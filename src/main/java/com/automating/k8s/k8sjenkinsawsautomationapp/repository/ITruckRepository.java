package com.automating.k8s.k8sjenkinsawsautomationapp.repository;

import com.automating.k8s.k8sjenkinsawsautomationapp.entity.Truck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITruckRepository
        extends JpaRepository<Truck, Long> {
}
