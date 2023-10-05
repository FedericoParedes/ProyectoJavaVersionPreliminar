package model.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Peliculas extends Pelicula {

	List<Pelicula> peliculas = new ArrayList<Pelicula>();

	public void cargarPelicula(Pelicula pelicula) {

		peliculas.add(pelicula);

	}

	public void enviarPelicula(Pelicula pelicula) {
		Iterator<Pelicula> iterator = peliculas.iterator();
		while (iterator.hasNext()) {
			Pelicula p = iterator.next();
			if (pelicula.getTitulo() == p.getTitulo()) {
				System.out.println(p);
			}
		}
	}

	public void enviarGenero(Pelicula pelicula) {
		Iterator<Pelicula> iterator = peliculas.iterator();
		while (iterator.hasNext()) {
			Pelicula p = iterator.next();
			if (pelicula.getGenero() == p.getGenero()) {
				System.out.println(p);
			}

		}
	}

	public void mostrarPeliculas() {
		for (Pelicula p : peliculas) {
			System.out.println(p);
		}

	}

}
