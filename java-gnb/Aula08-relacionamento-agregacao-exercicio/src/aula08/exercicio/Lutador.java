package aula08.exercicio;
public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        //this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
/*
        System.out.println("Nome: " + nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + peso);
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);
*/

    }

    
    //setters getters
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (getPeso() < 52.2) {
            this.categoria = "Inválido - abaixo do peso mínimo permitido";
        } else if (getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (getPeso() >= 83.9) {
            this.categoria = "Médio"; 
        } else if (getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido - acima do peso máximo permitodo";
        }
//        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
    
    
    //métodos
    public void apresentar() {
        System.out.println("Nome: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
    }
    public void status() {
        System.out.println("Nome: " + getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
        
    }
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta() {
        setDerrotas(getDerrotas() +1);
    }
    public void empatarLuta() {
        setEmpates(getEmpates() +1);
    }
    
    
}
