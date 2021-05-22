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
	public List<AutosDisponibles> getDisponibles() {
		
		@SuppressWarnings("unchecked")
		List<AutosDisponibles> resultado = entityManager.createNamedStoredProcedureQuery("AutosDisponibles").getResultList();
		/*for(int i = 0; i<resultado.size();i++)
			System.out.println(resultado.get(i).getMarca());*/
		
		
		/*StoredProcedureQuery query = entityManager.createStoredProcedureQuery("AutosDisponibles", "AutosDispon");
		List<AutosDisponibles> autos= query.getResultList();*/
		return resultado;
	}

	
	}
	
	

