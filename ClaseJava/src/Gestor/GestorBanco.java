package Gestor;

import Entidad.Banco;
import Entidad.Cliente;
import Entidad.Cuenta;
import javax.swing.*;

public class GestorBanco {
	
	//atributo se mantiene
	private static Cliente clienteActual;
	private static Banco banco;
	//gets y set
	public static Cliente getClienteActual() {
		return clienteActual;
	}
	
	public static void setClienteActual(int pos) {
		clienteActual=banco.getCliente(pos);
	}
	
	public static void datosPrueba() {
		setBanco(new Banco("Banco de la Amistad","Calle Feliz"));
		
		Cliente c=new Cliente("C1", "Diana Ruiz", "5565865678");
		banco.addCliente(c);
		
		Cliente c2=new Cliente("C2", "Ortega Ezequiel", "6614635746");
		banco.addCliente(c2);
		Cuenta cu=new Cuenta(123, 0, "Ahorro");
		c.addCuenta(cu);
	}

	public static Banco getBanco() {
		return banco;
	}

	public static void setBanco(Banco banco) {
		GestorBanco.banco = banco;
	} //no se ocupa el set, investigar porque
	
	public static String listaClientes() {
		Cliente clientes[] = banco.getClientes();
		
		StringBuilder s=new StringBuilder();
		for(int i=0;i<banco.getNoClientes();i++) {
			s.append(clientes[i].getNoCliente());
			s.append(" ");
			s.append(clientes[i].getNombre());
			s.append("\n");
		}
		return s.toString();
		}
	
	public static void mostrarClienteActual() {
	    Cliente c = GestorBanco.getClienteActual();
	    String info = "Cliente seleccionado:\n"
	                + "Número: " + c.getNoCliente() + "\n"
	                + "Nombre: " + c.getNombre() + "\n"
	                + "Teléfono: " + c.getTelefono();
	    JOptionPane.showMessageDialog(null, info);
	}
	
	public static void seleccionarCliente() {
		String datos = GestorBanco.listaClientes();
		int n=Integer.parseInt(JOptionPane.showInputDialog("Selecciona cliente \n" + datos));
		GestorBanco.setClienteActual(n);
	}
}
