package aula11.heranca;
public class Aula11Heranca {
    public static void main(String[] args) {
        // TODO code application logic here
        //Pessoa p1 =  new Pessoa(); não pode pa é ebstrata
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(21);
        v1.setSexo("M");
        System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(11111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        
        
    }
    
}
