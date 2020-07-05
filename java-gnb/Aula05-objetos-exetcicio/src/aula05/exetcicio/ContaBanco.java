package aula05.exetcicio;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    protected String nomeTipo;
    private String dono;
    private float saldo;
    private boolean status;
    private String situacao;

    public ContaBanco(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }
   
    public void estadoAtual() {
       System.out.println("----------------------------------------------------------------");
       System.out.println("Conta " + getNumConta() + " - " + getDono() + " - " + getNomeTipo() + " - " + getSituacao());
       System.out.println("Saldo: " + getSaldo());
       System.out.println("----------------------------------------------------------------");
       
       
    }
    
    public Integer getNumConta() {
        return numConta;
    }
    public void setNumConta(Integer nc) {
        this.numConta = nc;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tp) {
        this.tipo = tp;
        if (this.tipo=="cc") {
            setNomeTipo("Conta corrente - bônus de 50");
        } else if (tp == "cp") {
            setNomeTipo("Conta poupança - bônus de 150");
        }
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dn) {
        this.dono = dn;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float sd) {
        this.saldo = sd;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean st) {
        this.status = st;
        if (getStatus()) {
            setSituacao("Ativa");
        } else {
            setSituacao("Inativa");
        }
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
    
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if ( t == "cc") { 
            this.setSaldo(50);
        } else if (t == "cp") {
            this.setSaldo(150);
        }
    }   

    public void fecharConta () {
        if (saldo == 0f) {
            System.out.println("Conta encerrada");
            setStatus(false);
        } else{
            System.out.println("Tentativa de fechar conta sem sucesso. Seu saldo é´" + this.getSaldo() + ". O saldo tem que ser 0.");
        }
    }

    public void depositar (int v) {
        if (getStatus()) {
            setSaldo(getSaldo()+ v);
            System.out.println("Realizado depósito de " + v);
        }   else {
            System.out.println("Conta inativa, favor regularizar");
        }
    }

    public void sacar (int v) {
        if (getStatus()) {
            if (getSaldo() > v) {
                setSaldo(getSaldo() - v);
                System.out.println("Saque efetuado -" + v);
            } else {
                System.out.println("Tentativa de saque -" + v);
                System.out.println("Saque não efetuado. Saldo insuficiente");
            }
        } else { 
            System.out.println("Impossível sacar - conta inativa");
        } 
    }

    public void pagarMensa() {
        int v = 0; 
        if (getTipo() == "cc") {
            v = 12;
        } else { 
            if (getTipo() == "cp") {
                v = 20;
            } 
        } 
        if (getStatus() == true) {
            if (getSaldo() > v) {
                setSaldo(getSaldo() -v);
                System.out.println("Cobrada taxa mensal de " + v);
            }else{
                System.out.println("Saldo insuficiente para cobrar taxa");
            }
        }else{
            System.out.println("Impossível pagar - conta inativa");
        }
          
        
        
        
    }
}


