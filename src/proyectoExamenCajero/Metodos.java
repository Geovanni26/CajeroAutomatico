package proyectoExamenCajero;

public interface Metodos {
    void altaCliente(String numCuenta, String nombre);
    Cliente buscarCliente(String numCuenta);
    void consultarSaldo(String numCuenta);
    void deposito(String numCuenta, float monto);
    void retiro(String numCuenta, float monto);
}
