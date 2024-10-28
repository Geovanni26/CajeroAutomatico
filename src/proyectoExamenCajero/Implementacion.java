package proyectoExamenCajero;
/*Lógica de la clase*/
import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodos {
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void altaCliente(String numCuenta, String nombre) {
        // Validar que no se repita el número de cuenta
        for (Cliente c : clientes) {
            if (c.getNumCuenta().equals(numCuenta)) {
                System.out.println("Error: El número de cuenta ya existe.");
                return;
            }
        }
        Cliente nuevoCliente = new Cliente(numCuenta, nombre);
        clientes.add(nuevoCliente);
        System.out.println("Cliente registrado exitosamente.");
    }

    @Override
    public Cliente buscarCliente(String numCuenta) {
        for (Cliente c : clientes) {
            if (c.getNumCuenta().equals(numCuenta)) {
                return c;
            }
        }
        System.out.println("Cliente no encontrado.");
        return null;
    }

    @Override
    public void consultarSaldo(String numCuenta) {
        Cliente cliente = buscarCliente(numCuenta);
        if (cliente != null) {
            System.out.println("Saldo actual: $" + cliente.getSaldo());
        }
    }

    @Override
    public void deposito(String numCuenta, float monto) {
        if (monto <= 0 || monto > 10000) {
            System.out.println("Error: El monto debe ser mayor que 0 y menor o igual a 10,000.");
            return;
        }
        Cliente cliente = buscarCliente(numCuenta);
        if (cliente != null) {
            cliente.depositar(monto);
            System.out.println("Depósito exitoso. Saldo actual: $" + cliente.getSaldo());
        }
    }

    @Override
    public void retiro(String numCuenta, float monto) {
        Cliente cliente = buscarCliente(numCuenta);
        if (cliente != null) {
            if (monto <= 0 || monto > 10000) {
                System.out.println("Error: El monto debe ser mayor que 0 y menor o igual a 10,000.");
                return;
            }
            if (cliente.getSaldo() >= monto) {
                cliente.retirar(monto);
                System.out.println("Retiro exitoso. Saldo actual: $" + cliente.getSaldo());
            } else {
                System.out.println("Error: Saldo insuficiente.");
            }
        }
    }
}
