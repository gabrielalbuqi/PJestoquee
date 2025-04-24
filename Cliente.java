// Cliente.java
public abstract class Cliente {
    protected String nome;
    protected String email;
    protected String telefone;
    protected String identificador;

    public Cliente(String nome, String email, String telefone, String identificador) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.identificador = identificador;
    }

    public abstract String getCategoria(); // PF ou PJ

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Identificador: " + identificador);
        System.out.println("Categoria: " + getCategoria());
    }
}
