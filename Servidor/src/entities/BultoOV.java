package entities;

import java.util.Date;

public class BultoOV {
	private int id;
	private Date fecha;
	private OficinaVenta oficina;
	private Factura factura;
	private Cliente cliente;
	private RemitoCliente remito;
	
	public BultoOV() {

	}

	public BultoOV(int id, Date fecha, OficinaVenta oficina, Factura factura, Cliente cliente, RemitoCliente remito){
		this.id = id;
		this.fecha = fecha;
		this.oficina = oficina;
		this.factura = factura;
		this.cliente = cliente;
		this.remito = remito;
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
	
	public OficinaVenta getOficinaVenta() {
		return oficina;
	}

	public void setOficinaVenta(OficinaVenta oficina) {
		this.oficina = oficina;
	}
	
	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public RemitoCliente getRemitoCliente() {
		return remito;
	}

	public void setRemitoCliente(RemitoCliente remito) {
		this.remito = remito;
	}
}
