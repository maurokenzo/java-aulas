package aula04;
public class Aula04 {
    public static void main(String[] args) {
        
        //criando objeto caneta usando construtor
        Caneta c1 = new Caneta ("BIA","Roxa",0.7f,true);
        c1.status();
        
        //Caneta c1 = new Caneta() ;
        //c1.destampar();
        
        //mudando com setter
        c1.setModelo("GABI");  //c1.modelo = "Bic";
        c1.setPonta(2.5f);        //c1.ponta = 0.5f
        c1.setCor("Azul");
        c1.setTampada(false);
        System.out.println("Alterado com setters getters >> Modelo " + c1.getModelo() 
                + " de ponta " + c1.getPonta() + " cor " + c1.getCor() + " tampada: " + c1.isTampada());
        c1.status();               
                
       
    }
    
}
