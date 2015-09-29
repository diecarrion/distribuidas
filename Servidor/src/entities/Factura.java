package entities;

import java.util.Date;

public class Factura {

	private int id;
	private Date fecha;
	private float montoTotal;
	private OficinaVenta oficina;
	private Cliente cliente;
	
	public Factura()
	{
		
	}

	public Factura(int id, Date fecha, float montoTotal, OficinaVenta oficina, Cliente cliente)
	{
		this.id = id;
		this.fecha = fecha;
		this.montoTotal = montoTotal;
		this.oficina= oficina;
		this.cliente = cliente;
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
	
	public float getMontoTotal(){
		return montoTotal;
	}
	
	public void setMontoTotal(float montoTotal){
		this.montoTotal = montoTotal;
	}
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public OficinaVenta getOficinaVenta() {
		return oficina;
	}

	public void setOficinaVenta(OficinaVenta oficina) {
		this.oficina = oficina;
	}
}
