package Interfaz;

import javax.swing.*;
import Gestor.GestorBanco;

public class Interfaz {
	
	
	public static void main(String[] args) {
		
		Interfaz i =new Interfaz();
		GestorBanco.datosPrueba();
		i.menu();
	}
	
	
	public void menu() {
		//1.Datos del Banco
		//2.Clientes
		//	2.1 Seleccionar
		//	2.2 Ver cliente actual
		//	2.3 Cuentas
		//		2.3.1 mostrar cuentas
		//		2.3.2 ver datos de cuenta Actual
		//
		GestorBanco.setClienteActual(0);
		GestorBanco.mostrarClienteActual();
		}
}