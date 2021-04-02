package rivas.hiram.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rivas.hiram.app.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
	

}
