public class ContaEspecial extends Conta implements Pagavel{
    private Double limite;

    public ContaEspecial(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    @Override
    public String mostraSaldo() {
        double saldoAux = getSaldo() + limite;
        return "Saldo: " + saldoAux;
    }
    @Override
    public double calculaImposto() {
        return getSaldo()* 0.1;
    }
}
