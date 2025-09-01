package Entidad;

public class Movimiento extends Operacion {

	private int referencia;
	private String tipo;
	
	public Movimiento(float cantidad, String fecha, int folio, int referencia, String tipo) {
		//del padre
		super(cantidad, fecha, folio);
		//propios
		this.referencia=referencia;
		this.tipo=tipo;
	}
	
	public int getReferencia() {
		return referencia;
	}
	
	public void setReferencia(int referencia){
		this.referencia = referencia;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	//de la interfaz
	public void guardar(String movimiento) {
		//TODO Auto-generated method stub
	}
}
