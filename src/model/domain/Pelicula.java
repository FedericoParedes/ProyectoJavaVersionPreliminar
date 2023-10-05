package model.domain;

public class Pelicula {

	public String titulo;

	public int codigo;

	public String url;

	public String imagen;

	public String genero;

	public Pelicula() {
		// TODO Auto-generated constructor stub
	}
        
  
        public Pelicula(String titulo, int codigo, String url, String imagen, String genero) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
		this.url = url;
		this.imagen = imagen;
		this.genero = genero;
	}







	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Pelicula" + "\n" + "Titulo: " + titulo + "\n" + "Codigo: " + codigo + "\n" + "URL: " + url + "\n" + "Imagen: " + imagen + "\n" + "Genero: "
				+ genero;
	}                                                                                                                                                                 
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
