public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
        saldo = 0.0;
    }

    public String mostraSaldo() {
        return "Saldo: " + saldo;
    }
}