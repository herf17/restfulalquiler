package rivas.hiram.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import rivas.hiram.app.model.Alquiler;
import rivas.hiram.app.model.AutosParaAlquilar;

@Repository
public class CrearOrdenDAOImpl implements CrearOrdenDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int crearOrdenNueva(Alquiler alquiler) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(alquiler);
		return 0;
	}

	
	
	

}
