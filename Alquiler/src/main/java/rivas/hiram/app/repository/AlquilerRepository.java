package rivas.hiram.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rivas.hiram.app.model.Alquiler;

@Repository
public interface AlquilerRepository extends JpaRepository<Alquiler, Long> {

}
