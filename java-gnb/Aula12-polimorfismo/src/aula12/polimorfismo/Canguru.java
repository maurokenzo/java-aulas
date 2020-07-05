package aula12.polimorfismo;
public class Canguru extends Mamifero{
    @Override //POLIMORFISMO sobrepões o método locomover da superclasse
    public void locomover() {
        System.out.println("Saltando");
    }
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
    
}
