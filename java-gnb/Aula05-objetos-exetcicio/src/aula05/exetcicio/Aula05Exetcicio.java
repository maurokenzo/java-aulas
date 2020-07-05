package aula05.exetcicio;
public class Aula05Exetcicio {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco(0, true);
        ContaBanco c2 = new ContaBanco(0, true);
        
        
        c1.abrirConta("cc");
        c1.setDono("Ana Paula");
        c1.setNumConta(1111);
        c1.estadoAtual();
        
        c1.depositar(10000);
        c1.sacar(100040);
        c1.pagarMensa();
        c1.fecharConta();
        System.out.println("Saldo atual " + c1.getSaldo());

        c2.abrirConta("cp");
        c2.setDono("Macris");
        c2.setNumConta(1111);
        c2.estadoAtual();
        
        c2.depositar(2000);
        c2.sacar(10);
        c2.pagarMensa();
        c2.fecharConta();
        System.out.println("Saldo atual " + c2.getSaldo());

        
    }
    
}
