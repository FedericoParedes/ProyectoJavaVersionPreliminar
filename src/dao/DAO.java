package dao;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

public interface DAO <E, K> {

	E buscarPorId(K key);
		
	List<E> obtenerTodos();
	
	boolean insertar(E entidad);
	
	void actualizar(E entidad);
	
	void eliminar(E entidad);
	
    void getImagen(E entidad); 
    
    void getURL (E entidad );

}

