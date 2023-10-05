package main;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import dao.DAO;
import dao.PeliculaDAO;
import dao.imp.PeliculaDAOImp;
import model.domain.Buscador;
import model.domain.Pelicula;
import model.domain.Peliculas;
import model.domain.Usuario;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DAO<Pelicula, Integer> peliculaDAO = new PeliculaDAOImp();

		Pelicula pelicula = peliculaDAO.buscarPorId(17);
		
		pelicula.setGenero("Ciencia Ficcion");
		
		peliculaDAO.actualizar(pelicula);

	 
		
		
	}
}
