package aula08;
public class Aula08 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0]= new Lutador("Gabi", "Brasileira", 25, 180f, 45.0f, 12, 0, 0);
        l[1]= new Lutador("Fabi", "Brasileira", 20, 182f, 65.0f, 14, 1, 0);
        l[2]= new Lutador("Leia", "Brasileira", 21, 175f, 55.0f, 10, 0, 2);
        l[3]= new Lutador("Bia", "Brasileira", 19, 184f, 53.0f, 15, 3, 0);
        l[4]= new Lutador("Paula", "Brasileira", 22, 187f, 65.0f, 12, 0, 0);
        l[5]= new Lutador("Macris", "Brasileira", 30, 180f, 68.0f, 17, 0, 3);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[3],l[1]);
        UEC01.lutar();
        l[2].status();
        l[1].status();
        
        
        
        
        //l[3].setPeso(55);
        //l[2].ganharLuta();
        //l[3].perderLuta();
        //l[3].status();
        
        
    }
    
}
