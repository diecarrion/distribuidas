package entities;
import java.util.Date;

public class DescuentoCliente {
	private int id;
	private String condEsp;
	private float montoDescuento;
	private float porcentaje;
	private Date vigenteHasta;
	
	
	public DescuentoCliente() {

	}

	public DescuentoCliente(int id, String condEsp, float montoDescuento, float porcentaje, Date vigenteHasta){
		this.id = id;
		this.condEsp = condEsp;
		this.montoDescuento = montoDescuento;
		this.porcentaje = porcentaje;
		this.vigenteHasta = vigenteHasta;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCondEsp() {
		return condEsp;
	}

	public void setCondEsp(String condEsp) {
		this.condEsp = condEsp;
	}
	
	public float getMontoDescuento(){
		return montoDescuento;
	}
	
	public void setMontoDescuento(float montoDescuento){
		this.montoDescuento = montoDescuento;
	}
	
	public float getPorcentaje(){
		return porcentaje;
	}
	
	public void setPorcentaje(float porcentaje){
		this.porcentaje = porcentaje;
	}
	
	public Date getVigenteHasta() {
		return vigenteHasta;
	}

	public void setVigenteHasta(Date vigenteHasta) {
		this.vigenteHasta = vigenteHasta;
	}


}
