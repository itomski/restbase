package de.lubowiecki.restbase.repository;

import de.lubowiecki.restbase.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}