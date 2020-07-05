package aula12.polimorfismo;
public class Aula12Polimorfismo {
    public static void main(String[] args) {
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara w = new Arara();
        
        //m.setPeso(35.3f);
        //m.setCorPelo("Marron");
        //m.alimentar();
        //m.locomover();
        //m.emitirSom();
        
        a.locomover();
        p.locomover();
        r.locomover();
        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();

    }
    
}
