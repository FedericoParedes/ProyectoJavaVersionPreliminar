package model.domain;

public class Usuario {

	String nombrePelicula;

	String generoPelicula;

	public void buscarPorNombre() {
		Buscador nuevaBusqueda = new Buscador();
		nuevaBusqueda.buscarPorNombre(nombrePelicula);
	}

	public void buscarPorGenero() {
		Buscador nuevaBusqueda = new Buscador();
		nuevaBusqueda.buscarPorGenero(generoPelicula);

	}

	public void getPelicula(Pelicula pelicula) {
		System.out.println("La pelicula seleccionada es: \n" + pelicula + "\n");
    }

	public void getGenero(Pelicula peliculas) {
		System.out.println(peliculas);
	}

	public String getNombrePelicula() {
		return nombrePelicula;
	}

	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}

	public String getGeneroPelicula() {
		return generoPelicula;
	}

	public void setGeneroPelicula(String generoPelicula) {
		this.generoPelicula = generoPelicula;
	}

}
