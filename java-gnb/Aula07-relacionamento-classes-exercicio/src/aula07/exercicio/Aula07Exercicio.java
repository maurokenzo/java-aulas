package aula07.exercicio;
public class Aula07Exercicio {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[7];
        
        l[0]= new Lutador("Gabi", "Brasileira", 25, 180f, 45.0f, 12, 0, 0);
        l[1]= new Lutador("Fabi", "Brasileira", 20, 182f, 65.0f, 14, 1, 0);
        l[2]= new Lutador("Leia", "Brasileira", 21, 175f, 55.0f, 10, 0, 2);
        l[3]= new Lutador("Bia", "Brasileira", 19, 184f, 53.0f, 15, 3, 0);
        l[4]= new Lutador("Paula", "Brasileira", 22, 187f, 65.0f, 12, 0, 0);
        l[5]= new Lutador("Macris", "Brasileira", 30, 180f, 68.0f, 17, 0, 3);
        l[6]= new Lutador("Natalia", "Brasileira", 25, 186f, 70.0f, 16, 5, 0);
        
        l[3].setPeso(55);
        //l[2].ganharLuta();
        l[3].perderLuta();
        l[3].status();
        
        
    }
    
}
