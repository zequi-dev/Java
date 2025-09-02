package Entidad;

public class Cliente extends Persona {
    private String noCliente;
    private Cuenta[] cuentas;
    private int indice;

    public Cliente(String noCliente, String nombre, String telefono) {
        super(nombre, telefono);
        this.noCliente = noCliente;
        cuentas = new Cuenta[5];
        indice = 0;
    }

    public String getNoCliente() { return noCliente; }
    public void setNoCliente(String noCliente) { this.noCliente = noCliente; }

    public void addCuenta(Cuenta c) {
        if (indice < cuentas.length) {
            cuentas[indice++] = c;
        }
    }

    public Cuenta[] getCuentas() { return cuentas; }

    public String mostrarDatos() {
        return "Cliente: " + noCliente + ", Nombre: " + getNombre() + ", Tel: " + getTelefono();
    }
}
