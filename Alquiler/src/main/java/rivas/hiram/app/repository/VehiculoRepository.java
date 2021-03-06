package rivas.hiram.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rivas.hiram.app.model.Vehiculo;


@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, String> {

}
