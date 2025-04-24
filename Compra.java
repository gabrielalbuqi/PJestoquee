// Compra.java
import java.util.ArrayList;
import java.util.List;

public class Compra {
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<>();

    public Compra(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void exibirCompra() {
        cliente.exibirDados();
        System.out.println("Produtos comprados:");
        double total = 0;
        for (Produto p : produtos) {
            System.out.println("- " + p.getNome() + ": R$ " + p.getPreco());
            total += p.getPreco();
        }
        System.out.println("Total: R$ " + total);
    }
}
