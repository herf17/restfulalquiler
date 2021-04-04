package rivas.hiram.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rivas.hiram.app.model.Usuarios;


public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
	Usuarios findByUsername(String username);
}
