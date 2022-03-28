package punto_2;

public class Cuenta {

    int noCuenta;
    String nombreCliente;
    double saldo;

    public Cuenta() {
        this.noCuenta = 0;
        this.nombreCliente = "";
        this.saldo = 0;
    }

    //-----------------------------
    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int n) {
        this.noCuenta = n;
    }
    //-----------------------------

    public String getNombreCleinte() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombre) {
        this.nombreCliente = nombre;
    }
//-----------------------------

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double v) {
        this.saldo = v;
    }
    //-----------------------------

    public void setConsignar(double monto) {
        this.saldo += monto;
    }
//-----------------------------

    public void setRetirar(double monto) {
        this.saldo -= monto;
    }

}
