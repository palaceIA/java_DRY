package entities;

// Classe Notebook que herda da classe Produto
public class Notebook extends Produto{

    // Construtor da classe Notebook
    public Notebook(String nome, double preco, double desconto) {
        super(nome, preco, desconto); 
    }

    // Método para aplicar o desconto
    @Override
    public double aplicarDesconto() {
        return getPreco() * (getDesconto() / 100); // Convertendo desconto percentual para decimal
    }

    // Metodo para calcular o preço final
    // O preço final é o preço original menos o desconto aplicado
    // Sobrecarregando o método precoFinal da classe Produto
    @Override
    public double precoFinal() {
        return getPreco() - aplicarDesconto();
    }    


}
