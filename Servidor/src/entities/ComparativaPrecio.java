package entities;

public class ComparativaPrecio {
	private int id;
	private float mejorPrecio;
	
	public ComparativaPrecio()
	{}

	public ComparativaPrecio(int id, float mejorPrecio)
	{
		this.id = id;
		this.mejorPrecio = mejorPrecio;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

		
	public float getMejorPrecio(){
		return mejorPrecio;
	}
	
	public void setMejorPrecio(float mejorPrecio){
		this.mejorPrecio = mejorPrecio;
	}

}
