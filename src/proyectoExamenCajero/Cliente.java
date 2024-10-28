package proyectoExamenCajero;

public class Cliente {
    private String numCuenta;
    private String nombre;
    private float saldo;

    public Cliente(String numCuenta, String nombre) {
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.saldo = 0; // Por defecto el saldo es $0
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float monto) {
        this.saldo += monto;
    }

    public void retirar(float monto) {
        this.saldo -= monto;
    }
}
