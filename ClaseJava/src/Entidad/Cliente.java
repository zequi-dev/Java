package Entidad;

public class Cliente {
	//atributos propios
	private String noCliente;
	private String nombre;
	private String telefono;
	
	//atributo de la relacion con cuenta
	private Cuenta cuentas[];
	private int indice;
	
	//constructores
	public Cliente(String noCliente, String nombre, String telefono) {
		this.noCliente= noCliente;
		this.nombre = nombre;
		this.telefono = telefono;
		
		setCuentas(new Cuenta[5]);
		indice=0;
	}
	
	public Cliente() {
		setCuentas(new Cuenta[5]);
		indice=0;
	}
	
	public String getNoCliente() {
		return noCliente;
	}
	
	public void setNoCliente(String noCliente) {
		this.noCliente = noCliente;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono=telefono;
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta cuentas[]) {
		this.cuentas = cuentas;
	}
	
	public void addCuenta(Cuenta c) {
		cuentas[indice++]=c;
	}
}
