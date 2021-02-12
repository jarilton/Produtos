package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args, Date dataDeFabricacao) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();
		
		System.out.println("Insira o n�mero de produtos: ");
		int n = sc.nextInt();	
		
		for(int i = 1; i <= n; i++) {
			
			System.out.println("Dados do produto #" + i + ":");
			System.out.println("Comum, usado ou importado (c / u / i)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Pre�o: ");
			Double preco = sc.nextDouble();
 			System.out.println("Taxa alfandeg�ria: ");
 			Double taxaAlfandegaria = sc.nextDouble();
 		
 			char c = 0;
			if(ch == c) {
 				System.out.println("O produto � comum! ");
				@SuppressWarnings("unused")
				double produtoComum = sc.nextDouble(); 
				list.add(new Produto(nome, preco));
 			}
			else if(ch == c){
 				System.out.println("O produto � usado! ");
				@SuppressWarnings("unused")
				double produtoUsado = sc.nextDouble(); 
				list.add(new ProdutoUsado(nome, preco, dataDeFabricacao));
			}else{
				System.out.println("O produto � importado! ");
				@SuppressWarnings("unused")
				double produtoImportado = sc.nextDouble(); 
				list.add(new ProdutoImportado(nome, preco, taxaAlfandegaria));
				
			}
			
			
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PRE�O: ");
		for(Produto prod : list) {
			System.out.println(prod.getNome() + " - $" + String.format("%.2f", prod.etiquetaDePagamento()));
		}
		sc.close();

	}

}
