package model.domain;

public class Buscador {

	
	public void buscarPorNombre(String nombre) {
    	Peliculas pelicula = new Peliculas();
		pelicula.setTitulo(nombre);
		pelicula.enviarPelicula(pelicula);
	}

	public void buscarPorGenero(String genero) {
		Peliculas pelicula = new Peliculas();
		pelicula.setGenero(genero);
		pelicula.enviarPelicula(pelicula);
		
	}
	
	public void Genero(Pelicula peliculas) {
		Usuario usuario = new Usuario();
		usuario.getGenero(peliculas);
	}
	
	public  void returnPelicula(Pelicula pelicula) {
        Usuario usuario = new Usuario();
        usuario.getPelicula(pelicula);
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
