package ar.edu.unq.po2.tpObserver.ej1;

import java.util.List;

public class Articulo {
	private String titulo;
	private List<String> autores;
	private List<Filiacion> filiaciones;
	private TipoDeArticulo tipoDeArticulo;
	private Lugar lugarDePublicacion;
	private List<String> palabrasClave;
	
	public Articulo(String titulo, List<String> autores, List<Filiacion> filiaciones, TipoDeArticulo tipoDeArticulo, Lugar lugarDePublicacion, List<String> palabrasClave) {
		this.titulo = titulo;
		this.autores = autores;
		this.filiaciones = filiaciones;
		this.tipoDeArticulo = tipoDeArticulo;
		this.lugarDePublicacion = lugarDePublicacion;
		this.palabrasClave = palabrasClave;
	}

	public String getTitulo() {
		return titulo;
	}

	public List<String> getAutores() {
		return autores;
	}

	public List<Filiacion> getFiliaciones() {
		return filiaciones;
	}

	public TipoDeArticulo getTipoDeArticulo() {
		return tipoDeArticulo;
	}

	public Lugar getLugarDePublicacion() {
		return lugarDePublicacion;
	}

	public List<String> getPalabrasClave() {
		return palabrasClave;
	}
	
	
}
