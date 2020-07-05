package projetopessoas;
public class ProjetoPessoas {
    public static void main(String[] args) {
        //programa pincipal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 =  new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(186);
        
        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
 
        //p1.receberAumento(500); dá erro pois não está em p1
        //p1.mudaTrabalho(); dá erro não está em p1
        p2.fazerAniversario();
        p2.cancelarMatr();
        p4.mudaTrabalho();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
        
        
    }
    
}
