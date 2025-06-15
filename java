public abstract class livro {
    private String titulo;
    private String autor;
    private int anopublicacao;
    private boolean disponivel;

    livro (String titulo, String autor, int anopublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anopublocacao = anopublicacao;
        this.disponivel = disponivel;
    }
      public String gettitulo() {
          return this.titulo
              }
    public String getautor(){
        return this.autor;
    }
    public int getAnoPublicacao(){
        public void setTitulo (String titulo) {
            this.titulo = titulo;
    }
      public void emprestar() {
          if (this.disponivel) {
              this.disponivel = false;
       System.out.printhn ("emprestado");
          }else{
              System.out.println("livro indisponivel!");
    }
      }
      public void devolver () {
          if (!this.disponivel) {
              this.disponivel = true;
              System out.println ("devolvido com sucesso");
    }else{
              System.out.println ("erro ao desenvolver");
    }
      }
    public abstract void exibirdetalhes();

    private ArrayList <livro> livrosEmprestados;
    [= new ArrayList <> ();]
      this.livrosEmprestados = new ArrayList <> ();
   public interface ItemBiblioteca {
       boolean disponivel ();
package br.com.minhaclasse.contrato;
public interface ItemBiblioteca {
    boolean isDisponivel();
    void realizarEmprestimo();
    String getTitlo();   
}
package br.com.minhaclasse.modelo;
public abstract class Livro {
    String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;
}
  public Livro(String titulo, String autor, int anoPublicacao){
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
  }
   public boolean isDisponivel() {
    return disponivel;
   }
   package br.com.minhaclasse.modelo;
   import br.com.minhaclasse.contrato.ItemBiblioteca;
   public class LivroFisico extends Livro implements ItemBiblioteca {
    public LivroFisico(String titulo, String autor, int anoPublicacao, String localizacaoPrateleira){
      this.localizacaoPrateleira = localizacaoPrateleira;
    }
   package br.com.minhaclasse.modelo;
   import br.com.minhaclasse.contrato.ItemBiblioteca;
   public class Ebook extends Livro implements ItemBiblioteca {
    private String formato;
    public Ebook(Strin titulo, String autor, int anoPublicacao, double tamanho, String formato){
      super(titulo, autor, anoPublicacao);
      this.formato = formato;
    }
    public void exibirDetalhes(){
      System.out.println("Ebook: "+ getTitulo());
    }
   } 
   package br.com.minhaclasse.modelo;
   import java.util.ArrayList;
   public class Usuario {
    public String nome;
    public String idUsuario;

    public Usuario(String nome, String id) {
      this.nome = nome;
      this.idUsuario;
    }
    package br.com.minhaclasse.servico;
    important java.util.ArrayList;
    public class Biblioteca {
      private String nome;

      public Biblioteca(String nome) {
        import br.com.minhaclasse.servico.Biblioteca;
        
        public class Main {
          public static void man(String[] args) {
            Biblioteca b = new
            Biblioteca("Biblioteca Central");

          }
        }
  
    
   
