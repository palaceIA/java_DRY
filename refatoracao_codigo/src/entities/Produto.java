package entities;


// Classe abstrata 
public abstract class Produto {

    // Atributos comuns observados 
    private String nome ; 
    private double preco ; 
    private double desconto ;

    // Construtor
    public Produto(String nome,double preco,double desconto){
        this.nome = nome ;
        this.preco = preco ;
        this.desconto = desconto ;
    }

    // Sobrecarregando o construtor
    public Produto(){}

    // Metodos Getter
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    // Metodos Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public abstract double aplicarDesconto();

    public abstract double precoFinal();

    // Método toString para exibir os detalhes do produto
    @Override
    public String toString() {
        return "Produto -> " +
                "nome : '" + nome + '\'' +
                ", preco : " + preco +
                ", desconto : " + desconto;
    }
}
