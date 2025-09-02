package Interfaz;

import Gestor.GestorBanco;
import javax.swing.*;

public class Interfaz {
    public static void main(String[] args) {
        Interfaz i = new Interfaz();
        GestorBanco.datosPrueba();
        i.menu();
    }

    public void menu() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menú Principal\n" +
                "1. Ver cliente actual\n" +
                "2. Seleccionar cliente\n" +
                "3. Alta cuenta\n" +
                "4. Mostrar cuentas\n" +
                "5. Salir"));

            switch (opcion) {
                case 1:
                    GestorBanco.mostrarClienteActual();
                    break;
                case 2:
                    GestorBanco.seleccionarCliente();
                    break;
                case 3:
                    GestorBanco.altaCuenta();
                    break;
                case 4:
                    GestorBanco.mostrarCuentasClienteActual();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 5);
    }
}
