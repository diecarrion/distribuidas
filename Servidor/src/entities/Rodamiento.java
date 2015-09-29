package entities;

public class Rodamiento {

	private int id;
	private String codigoSKF;
	private String caracteristicas;
	private String marca;
	private String origen;
	
	public Rodamiento() {

	}
	
	public Rodamiento(int id, String codigoSKF, String caracteristicas, String marca, String origen){
		this.id = id;
		this.codigoSKF = codigoSKF;
		this.caracteristicas = caracteristicas;
		this.marca = marca;
		this.origen = origen;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoSKF() {
		return codigoSKF;
	}

	public void setCodigoSKF(String codigoSKF) {
		this.codigoSKF = codigoSKF;
	}
	
	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
}
