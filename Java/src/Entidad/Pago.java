package Entidad;

public class Pago extends Operacion {
	private String destino;
	
	public Pago(float cantidad, int fecha, String folio, String destino) {
		super(cantidad, folio, fecha);
		this.destino=destino;
	}
	

    public String mostrarDatos() {
        return "Pago a: " + destino + ", Cantidad: " + cantidad + ", Fecha: " + fecha;
    }

	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino=destino;
	}

	@Override
    public void guardar(String movimiento) {
        System.out.println("Guardando pago: " + movimiento);
    }

}
