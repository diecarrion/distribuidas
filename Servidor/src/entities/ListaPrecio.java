package entities;

import java.util.Date;

public class ListaPrecio {
	private int id;
	private Date fecha;
	private float precio;
	private Proveedor proveedor;
	
	public ListaPrecio() {

	}

	public ListaPrecio(int id, Date fecha, float precio, Proveedor proveedor) {
		this.id = id;
		this.fecha = fecha;
		this.precio = precio;
		this.proveedor = proveedor;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public float getPrecio(){
		return precio;
	}
	
	public void setPrecio(float precio){
		this.precio = precio;
	}
	
	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

}