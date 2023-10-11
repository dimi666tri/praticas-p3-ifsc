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
		produtoDois.setNome("Flor 2");
		produtoDois.setFornecedor("Dimitri");
		produtoDois.setPreco(15.0);
		produtoDois.setCodBarras((long)(45699123));
		
		Produto produtoTres = new Produto ();
		produtoTres.setNome("Flor 3");
		produtoTres.setFornecedor("Dimitri");
		produtoTres.setPreco(17.0);
		produtoTres.setCodBarras((long)(468101823));
		
		ArrayList <Produto> produtos = new ArrayList <Produto>(3);
		produtos.add(produto);
		produtos.add(produtoDois);
		produtos.add(produtoTres);
		
			for (Produto p : produtos ) {
				System.out.println(p.getNome());
				System.out.println(p.getFornecedor());
				System.out.println(p.getPreco());
				System.out.println(p.getCodBarras());
		}
		}
	}
