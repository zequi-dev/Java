package Entidad;

public class Pago extends Operacion {
	private String destino;
	
	public Pago(float cantidad, int fecha, String folio, String destino) {
		super(cantidad, folio, fecha);
		this.destino=destino;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino=destino;
	}

	@Override
	public void guardar(String movimiento) {
		// TODO Auto-generated method stub
		
	}
}
