import java.util.ArrayList;

public class App {

    public void executar() {
        ArrayList<Conta> contas = new ArrayList<>();
        Conta c = new Conta();
        contas.add(c);
        //System.out.println(c.mostraSaldo());
        Conta d = new Conta(11.11);
        contas.add(d);
        //System.out.println(d.mostraSaldo());
        ContaEspecial ce = new ContaEspecial(22.22, 33.33);
        contas.add(ce);
        //System.out.println(ce.mostraSaldo());
        for(Conta x: contas) {
            System.out.println(x.mostraSaldo());
        }

        System.out.println("Imposto: " + ce.calculaImposto());

        Pagavel p;
        p = ce;
        System.out.println(p.calculaImposto());
        //p = new ContaEspecial(22, 22);
    }
}