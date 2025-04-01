import entities.Celular;
import entities.Notebook;
import entities.Produto;
import entities.Tablet;

public class App {
    public static void main(String[] args) throws Exception {
        // Criação de
        Produto tablet = new Tablet("tablet-177",1700, 15);
        Produto notebook = new Notebook("Acer-3555", 3500, 12);
        Produto celular = new Celular("Iphone-6", 2500, 10);

        // Criação de um array de produtos
        Produto[] produtos = {tablet, notebook, celular};

        // Exibição dos produtos e seus preços finais
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
            System.out.println("Valor calculado com desconto : "+produto.precoFinal());
            System.out.println("-------------------------");
        }
    }
}
