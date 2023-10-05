package dao.imp;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.ConexionMySQLDB;
import dao.DAO;
import model.domain.Pelicula;

public class PeliculaDAOImp implements ConexionMySQLDB, DAO<Pelicula, Integer> {

	@Override
	public Pelicula buscarPorId(Integer key) {

		Pelicula peliculaBuscada = null;
		
		Connection conexion = getConexion();

		String sentenciaSQL = "SELECT * FROM peliculas WHERE pel_codigo = ?";

		try {
			PreparedStatement objetoSentenciaSQL = conexion.prepareStatement(sentenciaSQL);
			objetoSentenciaSQL.setInt(1, key);

			ResultSet resultado = objetoSentenciaSQL.executeQuery();
			while (resultado.next()) {
				int codigo = resultado.getInt("pel_codigo");
				String titulo = resultado.getString("pel_titulo");
				String genero = resultado.getString("pel_genero");
				String imagen = resultado.getString("pel_imagen");
				String url = resultado.getString("pel_url");
				peliculaBuscada = new Pelicula(titulo, codigo, url, imagen, genero);

			}
			objetoSentenciaSQL.close();
			conexion.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return peliculaBuscada;
	}

	@Override
	public boolean insertar(Pelicula entidad) {

		Connection conexion = getConexion();

		String sentenciaSQL = "INSERT INTO peliculas(pel_titulo, pel_genero, pel_imagen, pel_url)"
				+ "VALUES(?, ?, ?, ?)";

		try {
			PreparedStatement objetoSentenciaSQL = conexion.prepareStatement(sentenciaSQL);
			objetoSentenciaSQL.setString(1, entidad.getTitulo());
			objetoSentenciaSQL.setString(2, entidad.getGenero());
			objetoSentenciaSQL.setString(3, entidad.getImagen());
			objetoSentenciaSQL.setString(4, entidad.getUrl());
			objetoSentenciaSQL.execute();
			objetoSentenciaSQL.close();
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<Pelicula> obtenerTodos() {

		Pelicula peliculaBuscada = null;

		List<Pelicula> peliculas = new ArrayList<Pelicula>();

		Connection conexion = getConexion();

		String sentenciaSQL = "SELECT * FROM peliculas";

		Statement objetoSentenciaSQL = null;

		try {
			objetoSentenciaSQL = conexion.createStatement();
			ResultSet resultado = objetoSentenciaSQL.executeQuery(sentenciaSQL);
			while (resultado.next()) {
				int codigo = resultado.getInt("pel_codigo");
				String titulo = resultado.getString("pel_titulo");
				String genero = resultado.getString("pel_genero");
				String imagen = resultado.getString("pel_imagen");
				String url = resultado.getString("pel_url");
				peliculaBuscada = new Pelicula(titulo, codigo, url, imagen, genero);
				peliculas.add(peliculaBuscada);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				objetoSentenciaSQL.close();
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return peliculas;
	}

	@Override
	public void actualizar(Pelicula entidad) {

		Connection conexion = getConexion();

		String sentenciaSQL = "UPDATE peliculas SET pel_titulo=?, pel_genero=?, pel_imagen=?, pel_url=? WHERE pel_codigo=?";

		try {
			PreparedStatement objetoSentenciaSQL = conexion.prepareStatement(sentenciaSQL);
			objetoSentenciaSQL.setString(1, entidad.getTitulo());
			objetoSentenciaSQL.setString(2, entidad.getGenero());
			objetoSentenciaSQL.setString(3, entidad.getImagen());
			objetoSentenciaSQL.setString(4, entidad.getUrl());
			objetoSentenciaSQL.setInt(5, entidad.getCodigo());
			objetoSentenciaSQL.executeUpdate();
			objetoSentenciaSQL.close();
			conexion.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		

		}

	}

	@Override
	public void eliminar(Pelicula entidad) {
		
		Connection conexion = getConexion();

		String sentenciaSQL = "DELETE FROM peliculas WHERE pel_codigo = ?";

		try {
			PreparedStatement objetoSentenciaSQL = conexion.prepareStatement(sentenciaSQL);
			objetoSentenciaSQL.setInt(1, entidad.getCodigo());
            objetoSentenciaSQL.executeUpdate();
			objetoSentenciaSQL.close();
			conexion.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

	}

	@Override
	public void getImagen(Pelicula entidad) {

			URL url=null;
			try {
			    url = new URL(entidad.getImagen());
			    try {
			        Desktop.getDesktop().browse(url.toURI());
			    } catch (IOException e) {
			        e.printStackTrace();
			    } catch (URISyntaxException e) {
			        e.printStackTrace();
			    }
			} catch (MalformedURLException e1) {
			    e1.printStackTrace();
			}
		
	}

	@Override
	public void getURL(Pelicula entidad) {

		URL url=null;
		try {
		    url = new URL(entidad.getUrl());
		    try {
		        Desktop.getDesktop().browse(url.toURI());
		    } catch (IOException e) {
		        e.printStackTrace();
		    } catch (URISyntaxException e) {
		        e.printStackTrace();
		    }
		} catch (MalformedURLException e1) {
		    e1.printStackTrace();
		}	
		
	}

	@Override
	public Pelicula buscarPorNombre(Pelicula entidad) {
	
        Pelicula peliculaBuscada = null;

		Connection conexion = getConexion();

		String sentenciaSQL = "SELECT * FROM peliculas WHERE pel_titulo = ?";

		try {
			PreparedStatement objetoSentenciaSQL = conexion.prepareStatement(sentenciaSQL);
			objetoSentenciaSQL.setString(1, entidad.titulo);

			ResultSet resultado = objetoSentenciaSQL.executeQuery();
			while (resultado.next()) {
			    int codigo = resultado.getInt("pel_codigo");
				String titulo = resultado.getString("pel_titulo");
				String genero = resultado.getString("pel_genero");
				String imagen = resultado.getString("pel_imagen");
				String url = resultado.getString("pel_url");
				peliculaBuscada = new Pelicula(titulo, codigo, url, imagen, genero);

			}
			objetoSentenciaSQL.close();
			conexion.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return peliculaBuscada;
		
		//return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
