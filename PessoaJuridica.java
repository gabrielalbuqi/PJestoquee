// PessoaJuridica.java
public class PessoaJuridica extends Cliente {
    public PessoaJuridica(String nome, String email, String telefone, String cnpj) {
        super(nome, email, telefone, cnpj);
    }

    @Override
    public String getCategoria() {
        return "Pessoa Jurídica";
    }
}
