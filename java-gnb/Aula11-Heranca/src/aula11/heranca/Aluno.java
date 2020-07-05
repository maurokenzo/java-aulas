package aula11.heranca;
//public final class Aluno extends Pessoa{  se usar final não pode ser herdado por subclasse (extends)
public class Aluno extends Pessoa{

    //herança para diferença. tem tudo de Pessoa mais os proprios atributos e métodos
    private int matricula;
    private String curso;
    //public final void pagarMensalidade() { se utilizar final não pode usar @override na subclasse
    public void pagarMensalidade() {    
        System.out.println("Pagando mensalidade do aluno " + nome); //não usado getNome poois nome está protected na superclasse
    }

    //getters setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
    
}
