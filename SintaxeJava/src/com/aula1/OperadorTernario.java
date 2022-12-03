package com.aula1;

public class OperadorTernario {

	

	public static void main(String[] args) {
		
		//Declarando variavel
		String resultado = "";
		int valor1 = 5;
		int valor2 = 8;
		int a ,b;
		a=1;
		b=5;
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		
		
		
		//condicional utilizando uma estrutura if
		if (valor1 == valor2) {
			resultado = "Verdadeiro";
		} else {
			resultado = "Falso";
			
		}
		System.out.println(resultado);
		
				
		//mesma condicional
		 	String resultado1 = (a == b) ? "verdadeiro" : "Falso";
		 	System.out.println(resultado1);
		 	
			boolean simnao = a == b;
		 	System.out.println(simnao);
		 	
		 	if(condicao1 && condicao2) {
		 		System.out.println("As duas condições são verdadeiras");
		 	}
		 	if (condicao1 || condicao2) {
		 		System.out.println("As duas condições são falsa");
			}
		 	System.out.println("Fim");
		 	
		 	
		 	
	}	
}
