package Entidad;

public class Cuenta {
	//atributos propios
	private int noCuenta;
	private float saldo;
	private String tipo;
	
	//atributos de la relacion
	private Cliente cliente;
	private Operacion operaciones[];
	
	//construcotres
	public Cuenta(int noCuenta, float saldo, String tipo) {
		this.noCuenta = noCuenta;
		this.saldo = saldo;
		this.tipo = tipo;
		
		setOperaciones(new Operacion[10]);
	}
	
	public int getNoCuenta() {
		return noCuenta;
	}
	
	public void setNoCuenta(int noCuenta) {
		this.noCuenta=noCuenta;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo=saldo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Operacion[] getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(Operacion operaciones[]) {
		this.operaciones = operaciones;
	}
}
