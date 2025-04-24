public class PessoaFisica extends Cliente {
    public PessoaFisica(String nome, String email, String telefone, String cpf) {
        super(nome, email, telefone, cpf);
    }

    @Override
    public String getCategoria() {
        return "Pessoa Física";
    }
}
