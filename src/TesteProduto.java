

import Entidades.ConjuntoProdutos;
import Entidades.Fornecedor;
import Entidades.Produto;

public class TesteProduto {
    public static void main(String[] args) throws Exception {
        System.out.println("Sistema ok!");

       Fornecedor forn1 = new Fornecedor("1234321", null, "Carlos");
       Fornecedor forn2 = new Fornecedor("543212345", null, "Pedro");

       Produto produto1 = new Produto(1, "Televisão", (float) 3500.00, forn1);
       Produto produto2 = new Produto(2, "Computador", (float) 3000.00, forn2);
       Produto produto3 = new Produto(3, "Sofá", (float) 2500.00, forn2);
       Produto produto4 = new Produto(4, "Forno Micro-ondas", (float) 500.00, forn1);

       ConjuntoProdutos conjuntoProdutos = new ConjuntoProdutos();  

       //ADICIONAR PRODUTOS
        conjuntoProdutos.adicionarProdutos(produto1);
        conjuntoProdutos.adicionarProdutos(produto2);
        conjuntoProdutos.adicionarProdutos(produto3);
        conjuntoProdutos.adicionarProdutos(produto4);

        
        //REMOVE PRODUTO
        //conjuntoProdutos.removerProdutos(1);

        //ATUALIZA NOME
        //conjuntoProdutos.atualizarNome(2, "Mousepad");

        //ATUALIZA PREÇO 
        //conjuntoProdutos.atualizarPreco(1, (float) 230.00);

        //ATUALIZA PREÇO DO PRODUTO ( % )
        //conjuntoProdutos.atualizarPrecoPorcentagem(1, (float)10.0);

        //MOSTRA PRODUTOS
        conjuntoProdutos.mostrarProdutos();
       


        
    }
}
