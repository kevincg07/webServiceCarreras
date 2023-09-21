package comcarreras.service;

import java.util.List;

import com.persistence_escuela.entity.Carreras;
import com.persistence_escuela.request.CarrerasRequest;

public interface CarrerasService {
	
	Carreras guardar(CarrerasRequest request);
	Carreras actualizar(CarrerasRequest request);
	Carreras buscar(int id);
	Carreras buscar(String name);
	String borrar(int id);
	List mostrar();

}
