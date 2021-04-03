package rivas.hiram.app.dao;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import rivas.hiram.app.model.AutosDisponibles;
import rivas.hiram.app.model.Vehiculo;

@Repository
public class VehiculosDispoDAOImpl implements VehiculosDispoDAO {
	@PersistenceContext
	EntityManager entityManager;


	@Override
	public List<Vehiculo> getDisponibles() {
		
		List<Vehiculo> resultado = Collections.checkedList(entityManager.createNamedStoredProcedureQuery("AutosDisponibles").getResultList(), Vehiculo.class);
		return resultado;
	}

	
	}
	
	

