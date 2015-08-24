package dto;
public class Cliente {

	private int id;
	private String nombre;
	private String telefono;
	private String domicilio;
	private String condicion_venta;
	private String test;

	public Cliente() {

	}

	public Cliente(int id, String nombre, String apellido, String telefono,
			String domicilio, String condicion_venta) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.domicilio = domicilio;
		this.condicion_venta = condicion_venta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCondicion() {
		return condicion_venta;
	}

	public void setCondicion(String condicion) {
		this.condicion_venta = condicion;
	}

}
