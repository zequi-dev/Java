package Gestor;

import Entidad.*;
import javax.swing.*;

public class GestorBanco {
    private static Cliente clienteActual;
    private static Banco banco;

    public static void datosPrueba() {
        banco = new Banco("Banco de la Amistad", "Calle Feliz");
        Cliente c1 = new Cliente("C1", "Diana Ruiz", "5565865678");
        Cliente c2 = new Cliente("C2", "Ezequiel Ortega", "6614635746");
        banco.addCliente(c1);
        banco.addCliente(c2);
    }

    public static void setClienteActual(int pos) {
        clienteActual = banco.getCliente(pos);
    }

    public static Cliente getClienteActual() {
        return clienteActual;
    }

    public static String listaClientes() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < banco.getNoClientes(); i++) {
            Cliente c = banco.getCliente(i);
            sb.append(i).append(". ").append(c.mostrarDatos()).append("\n");
        }
        return sb.toString();
    }

    public static void mostrarClienteActual() {
        if (clienteActual != null) {
            JOptionPane.showMessageDialog(null, clienteActual.mostrarDatos());
        } else {
            JOptionPane.showMessageDialog(null, "No hay cliente seleccionado.");
        }
    }

    public static void seleccionarCliente() {
        String lista = listaClientes();
        int pos = Integer.parseInt(JOptionPane.showInputDialog("Selecciona cliente:\n" + lista));
        setClienteActual(pos);
    }

    public static void altaCuenta() {
        // Solicitar datos del cliente
        String noCliente = JOptionPane.showInputDialog("Número de cliente:");
        String nombre = JOptionPane.showInputDialog("Nombre del cliente:");
        String telefono = JOptionPane.showInputDialog("Teléfono del cliente:");

        // Crear cliente y agregarlo al banco
        Cliente nuevoCliente = new Cliente(noCliente, nombre, telefono);
        banco.addCliente(nuevoCliente);

        // Solicitar datos de la cuenta
        int noCuenta = Integer.parseInt(JOptionPane.showInputDialog("Número de cuenta:"));
        float saldo = Float.parseFloat(JOptionPane.showInputDialog("Saldo inicial:"));
        String tipo = JOptionPane.showInputDialog("Tipo de cuenta:");

        // Crear cuenta y asociarla al cliente
        Cuenta nuevaCuenta = new Cuenta(noCuenta, saldo, tipo);
        nuevoCliente.addCuenta(nuevaCuenta);

        // Establecer como cliente actual
        clienteActual = nuevoCliente;

        JOptionPane.showMessageDialog(null, "Cuenta y cliente registrados exitosamente.");
    }


    public static void mostrarCuentasClienteActual() {
        if (clienteActual == null) {
            JOptionPane.showMessageDialog(null, "No hay cliente seleccionado.");
            return;
        }

        Cuenta[] cuentas = clienteActual.getCuentas();
        StringBuilder sb = new StringBuilder("Cuentas del cliente:\n");

        for (Cuenta cuenta : cuentas) {
            if ( cuenta != null ) {
                sb.append("────────────────────────────\n");
                sb.append("Cuenta No: ").append(cuenta.getNoCuenta()).append("\n");
                sb.append("Tipo: ").append(cuenta.getTipo()).append("\n");
                sb.append("Saldo: ").append(cuenta.getSaldo()).append("\n");
                sb.append("Operaciones:\n");

                Operacion[] operaciones = cuenta.getOperaciones();
                boolean tieneOperaciones = false;

                for (Operacion op : operaciones) {
                    if (op != null) {
                        tieneOperaciones = true;
                        if (op instanceof Movimiento) {
                            Movimiento m = (Movimiento) op;
                            sb.append("  → Movimiento: ").append(m.mostrarDatos()).append("\n");
                        } else if (op instanceof Pago) {
                            Pago p = (Pago) op;
                            sb.append("  → Pago: ").append(p.mostrarDatos()).append("\n");
                        }
                    }
                }

                if (!tieneOperaciones) {
                    sb.append("  (Sin operaciones registradas)\n");
                }
            }
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }

}

