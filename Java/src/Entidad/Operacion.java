package Entidad;

public abstract class Operacion implements Logable {
	protected float cantidad;
	protected String fecha;
	protected int folio;
	
	public Operacion(float cantidad, String fecha, int folio) {
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.folio = folio;
	}
	
	public float getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public int getFolio() {
		return folio;
	}
	
	public void setFolio(int folio) {
		this.folio = folio;
	}
}