class TestaIdade {

    public static void main(String[] args) {
        // imprime a idade
        int idade = 20;
        System.out.println(idade);

        // gera uma idade no ano seguinte
        int idadeNoAnoQueVem;
        idadeNoAnoQueVem = idade + 1;

        // imprime a idade
        System.out.println(idadeNoAnoQueVem);
     }
}

class Idade_while {

   public static void main(String[] args) {
	int idade = 15;
	while (idade < 18) {
	System.out.println(idade);    
	idade = idade + 1;
	}
   }
}

class for_teste {

   public static void main(String[] args) {
	for (int i = 0; i < 100; i++) {
   	 if (i > 50 && i < 60) {
       	 break; //continue;
   	 }	
   	 System.out.println(i);
	}
   }
}




class achei_resto {


   public static void main(String[] args) {	
	for (int i = 1; i < 100; i++) {
   	 if (i % 19 == 0) {
        	System.out.println("Achei um número divisível por 19 entre 1 e 100");
       		System.out.println(i);
	 break;
   	 }	
	}	
   }

}
