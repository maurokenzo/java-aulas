package aula11.heranca;
public class Bolsista extends Aluno { //hedando classe Aluno
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + nome);
    }
    
    @Override //sobrepõe o pagarMansalidade() da superclasse Aluno
    public void pagarMensalidade() {
        System.out.println(this.nome + "é bolsista. Pagamento facilitado");
               
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
    

}
