package aula08;

import java.util.Random;

public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int roubds;
    private boolean aprovada;
    
    //détodos públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() .equals(l2.getCategoria()) && (l1 != l2)) {
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);            
        } else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }

    public void lutar() {
        if (getAprovada()) {
            System.out.println("====Desafiado====");
            desafiado.apresentar();
            System.out.println("====Desafiante====");
            desafiante.apresentar();
            Random vitoria = new Random();
            int vencedor = vitoria.nextInt(3);
            System.out.println("====Resultado++++");
            System.out.println(vencedor);
            switch(vencedor) {
                case 0: //empate
                    System.out.println(desafiado.getNome() + " e " + desafiante.getNome() + " Empataram!!!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Desafiada " + desafiado.getNome() + " venceu!!!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Desafiante " + desafiante.getNome() + " venceu!!!");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }
    
    
    //getters setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRoubds() {
        return roubds;
    }

    public void setRoubds(int roubds) {
        this.roubds = roubds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
