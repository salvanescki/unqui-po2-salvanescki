package ar.edu.unq.po2.tpObserver.ej1;

public class Lugar {
	
	private String ciudad;
	private String estadoProvincia;
	private String pais;
	
	public Lugar(String ciudad, String estadoProvincia, String pais) {
		this.ciudad = ciudad;
		this.estadoProvincia = estadoProvincia;
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getEstadoProvincia() {
		return estadoProvincia;
	}

	public String getPais() {
		return pais;
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == this) return true;
		if(other == null || getClass() != other.getClass()) return false;
		Lugar o = (Lugar) other;
		return ciudad.equals(o.getCiudad())
			   && estadoProvincia.equals(o.getEstadoProvincia())
			   && pais.equals(o.getPais());
	}

}
