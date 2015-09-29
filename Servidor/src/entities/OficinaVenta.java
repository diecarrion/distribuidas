package entities;

import javax.persistence.*;

@Entity
@Table(name="OficinasVenta")
public class OficinaVenta {

	@Id 
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private String nombre;
	private String telefono;
	private String provincia;
	private String localidad;
	
	
	public OficinaVenta() {
	}
	
	public OficinaVenta(int id, String nombre, String telefono, String provincia,
			String localidad) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.provincia = provincia;
		this.localidad = localidad;
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

	public void setTelefono(String tel) {
		this.telefono = tel;
	}
	
	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

}
