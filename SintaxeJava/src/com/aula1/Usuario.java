package com.aula1;

public class Usuario {
	
	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV Ligada ? :"+ smartTv.ligada);
		System.out.println("Canal atual ? :" + smartTv.canal);
		System.out.println("Volume atual ? :" + smartTv.volume);
	
		smartTv.ligar();
		System.out.println("Novo - TV Ligada ? :"+ smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo - TV Ligada ? :"+ smartTv.ligada);
		
		smartTv.baixarCanal();
		System.out.println("Novo - Canal atual ? :" + smartTv.canal);
		
		smartTv.aumentarCanal();
		System.out.println("Novo - Canal atual ? :" + smartTv.canal);
		
		smartTv.baixarVolume();
		System.out.println(" Novo - Volume atual ? :" + smartTv.volume);
		
		smartTv.baixarVolume();
		System.out.println(" Novo - Volume atual ? :" + smartTv.volume);
		
		smartTv.aumentarCanal();
		System.out.println("Novo - Canal atual ? :" + smartTv.canal);
		
		
	}

}
