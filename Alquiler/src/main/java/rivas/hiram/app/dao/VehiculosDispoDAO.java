package rivas.hiram.app.dao;

import java.util.List;

import rivas.hiram.app.model.AutosDisponibles;
import rivas.hiram.app.model.Vehiculo;

public interface VehiculosDispoDAO {
	public List<AutosDisponibles> getDisponibles();
}
