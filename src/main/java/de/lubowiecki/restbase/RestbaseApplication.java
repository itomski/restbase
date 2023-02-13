package de.lubowiecki.restbase;

import de.lubowiecki.restbase.model.Brand;
import de.lubowiecki.restbase.model.Status;
import de.lubowiecki.restbase.model.Vehicle;
import de.lubowiecki.restbase.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RestbaseApplication implements CommandLineRunner {

	@Autowired
	private VehicleRepository vehicleRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestbaseApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		/*
		Vehicle.VehicleBuilder builder = Vehicle.builder();
		builder.brand(Brand.BMW).type("3er").status(Status.ACTIVE);

		List<Vehicle> vehicles = new ArrayList<>();
		Vehicle v = new Vehicle();
		v.setBrand(Brand.VW);
		v.setType("Polo");
		v.setRegistration("HH:AB123");
		v.setStatus(Status.ACTIVE);

		vehicles.add(v);
		vehicles.add(builder.registration("HH:CD234").build());
		vehicles.add(builder.registration("HH:GH773").build());
		vehicles.add(builder.registration("HH:ZE225").build());

		vehicleRepository.saveAll(vehicles); // Speichert den Inhalt der Liste
		*/
	}
}
