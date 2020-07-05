package aula12.polimorfismo;
public class Cachorro extends Mamifero{
    @Override // POLIMORFISMO sobrepõe o método emitirSom() da superclasse
    public void emitirSom() {
        System.out.println("Au Au AU AU!!!!");
    }
    
}
