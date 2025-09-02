package Entidad;

public class Banco {
	//atributos propios
	private String nombre;
	private String direccion;

	
	//relacion de agregacion
	private Cliente Clientes[];
	private int indice;
	
	public Banco(String nombre, String direccion) {
		this.nombre = nombre; 
		this.direccion = direccion;
		setClientes(new Cliente[10]);
		indice=0;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Cliente[] getClientes() {
		return Clientes;
	}

	public void setClientes(Cliente clientes[]) {
		this.Clientes = clientes;
	}
	
	public void addCliente(Cliente cliente) {
		Clientes[indice++]=cliente;
		
	}
	
	public Cliente getCliente(int pos) {
		return Clientes[pos];
	}

	public int getNoClientes() {
		return indice;
	}
	
	
}
