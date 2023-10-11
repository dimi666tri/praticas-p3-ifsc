package lista5;

import java.util.ArrayList;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setNome("Flor");
		produto.setFornecedor("Dimitri");
		produto.setPreco(13.0);
		produto.setCodBarras((long)(4568123));
		
		Produto produtoDois = new Produto ();
		produto.setNome("Flor 2");
		produto.setFornecedor("Dimitri");
		produto.setPreco(15.0);
		produto.setCodBarras((long)(45699123));
		
		Produto produtoTres = new Produto ();
		produto.setNome("Flor 3");
		produto.setFornecedor("Dimitri");
		produto.setPreco(17.0);
		produto.setCodBarras((long)(468101823));
		
		ArrayList <Produto> produtos = new ArrayList <Produto>(3);
		produtos.add(produto);
		produtos.add(produtoDois);
		produtos.add(produtoTres);
		
			for (Produto p : produtos ) {
				System.out.println(produto.getNome());
				System.out.println(produto.getFornecedor());
				System.out.println(produto.getPreco());
				System.out.println(produto.getCodBarras());
		}
		}
	}
