package rivas.hiram.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rivas.hiram.app.model.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
	Usuarios findByUsername(String username);
	
	Boolean existsByUsername(String username);
}
