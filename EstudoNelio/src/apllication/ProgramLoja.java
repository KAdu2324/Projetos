package apllication;

import java.util.Scanner;

import entities.Produtos;

public class ProgramLoja {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do produto: ");
		String nome = sc.nextLine();
		System.out.println("Informe o preço");
		double preco = sc.nextDouble();
		System.out.println("informe a qauntidade");
		int quantidade = sc.nextInt();
		
		Produtos produto = new Produtos(nome,preco,quantidade);
		
		produto.setNome("Computador");
		
		System.out.println("PRoduto atualizado: " + produto.getNome());
		
		System.out.println(produto.toString());
		
//		System.out.println();
//		System.out.println("Produto:" + produto );
//		System.out.println();
//		
//		System.out.println("Adicione ao estoque: ");
//		quantidade = sc.nextInt();
//		produto.adicionarProduto(quantidade);
//		System.out.println(produto.toString());
//		System.out.println();
//		
//		System.out.println("Remover do estoque: ");
//		int removeQuantidade = sc.nextInt();
//		produto.removerProduto(removeQuantidade);
//		System.out.println(produto.toString());
		
		sc.close();
	}

}
