package aula09.exercicio;
public class Aula09Exercicio {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Ana", 25, "F");
        
        l[0] = new Livro("Pizzas", "Roberta", 300, p[0]);
        l[1] = new Livro("Caminhadas", "Gabi", 300, p[1]);        
        l[2] = new Livro("Cozinha boa", "Macris", 300, p[1]);

        l[0].abrir();
        l[0].folhear(1);
        //l[0].avancaPag();
        l[0].voltarPag();
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
                

    }
    
}
