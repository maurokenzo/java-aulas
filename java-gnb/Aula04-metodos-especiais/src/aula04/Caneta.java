package aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    //este é o método contrutor
    public Caneta(String m, String c, float p, boolean t) { 
       this.modelo = m;
       this.cor = c;
       this.ponta = p;
       this.tampada = t;
     //this.tampar();
     //this.cor = "Azul";
    }
    
    //getters e setters
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
        public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public boolean isTampada() {
        return this.tampada;
    }
    public void setTampada(boolean t) {
        this.tampada = t;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    } 
    
        public void status() {
        /*    System.out.println("SOBRE A CANETA");
              System.out.println("Modelo: " + this.getModelo());
              System.out.println("Ponta: " + this.getPonta());
              System.out.println("Cor: " + this.getCor());
              System.out.println("Tampada " + this.isTampada());    
        */  
           
            //status em uma linha
            System.out.println("SOBRE A CANETA >> Modelo: " + this.getModelo() + ", ponta: " 
                    + this.getPonta() + ", cor: " + this.getCor() 
                    + ", tampada: " + this.isTampada());   
    }    
 
}
