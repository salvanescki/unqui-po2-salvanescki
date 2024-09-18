package ar.edu.unq.po2.tpSOLID.banco;

public class PropiedadInmobiliaria {
	private String descripción;
	private String dirección;
	private long valorFiscal;

	public PropiedadInmobiliaria(String descripción, String dirección, long valorFiscal) {
		this.descripción = descripción;
		this.dirección = dirección;
		this.valorFiscal = valorFiscal;
	}

	public String getDescripción() {
		return descripción;
	}

	public String getDirección() {
		return dirección;
	}

	public long getValorFiscal() {
		return valorFiscal;
	}
}
