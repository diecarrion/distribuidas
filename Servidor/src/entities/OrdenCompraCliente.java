package entities;

import java.util.Date;

public class OrdenCompraCliente {
	private int numero;
	private Date fecha;
	private OficinaVenta oficina;
	private Cliente cliente;
	private RemitoCliente remito;
	private Pedido pedido;
	
	public OrdenCompraCliente() {

	}

	public OrdenCompraCliente(int num, Date fecha, OficinaVenta oficina, Cliente cliente, RemitoCliente remito, Pedido pedido){
		this.numero = num;
		this.fecha = fecha;
		this.oficina = oficina;
		this.cliente = cliente;
		this.remito = remito;
		this.pedido = pedido;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
	
	public OficinaVenta getOficinaVenta() {
		return oficina;
	}

	public void setOficinaVenta(OficinaVenta oficina) {
		this.oficina = oficina;
	}
	
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
