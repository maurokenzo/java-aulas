package aula09.exercicio;
public class Livro implements Publicacao{
    //atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    
    //métodos públicos
    // adicionado toString() e renoemado para detlhas
    public String detalhes() {
        return "Livro ================================" + "\n Titulo: " + titulo 
                + " - Autor: " + autor + "\n Total de Paginas: " 
                + totPaginas + " - Pagina Atual: " + pagAtual 
                + "\n Aberto: " + aberto 
                + "\n Leitor: " + leitor.getNome()
                + " - Idade: " + leitor.getIdade()
                + " - Sexo: " + leitor.getSexo();
        
        
    }



    
    
    //getters e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // métodos abstratos (implements)
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            p = this.totPaginas;
        }
        this.pagAtual = p;
    }

    @Override
    public void avancaPag() {
        if (this.pagAtual < this.totPaginas) {
                    this.pagAtual++;
        }
    }

    @Override
    public void voltarPag() {
        if (this.pagAtual >2) {
            this.pagAtual--;
        }

    }
    
    
}
