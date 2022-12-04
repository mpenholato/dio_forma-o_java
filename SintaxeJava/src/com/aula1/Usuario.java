package com.aula1;

public class Usuario {
	
	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV Ligada ? :"+ smartTv.ligada);
		System.out.println("Canal atual ? :" + smartTv.canal);
		System.out.println("Volume atual ? :" + smartTv.volume);
	
		smartTv.ligar();
		System.out.println("Ligando - TV Ligada ? :"+ smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Desligando - TV Ligada ? :"+ smartTv.ligada);
		
		smartTv.baixarCanal();
		System.out.println("Baixando - Canal atual ? :" + smartTv.canal);
		
		smartTv.aumentarCanal();
		System.out.println("Aumentando - Canal atual ? :" + smartTv.canal);
		
		smartTv.baixarVolume();
		System.out.println(" Baixando- Volume atual ? :" + smartTv.volume);
		
		smartTv.baixarVolume();
		System.out.println(" Baixando - Volume atual ? :" + smartTv.volume);
		
		smartTv.aumentarCanal();
		System.out.println("Aumentando - Canal atual ? :" + smartTv.canal);
				
		smartTv.mudarCanal(35);
		System.out.println("MUDANDO CANAL - Canal atual ? :" + smartTv.canal);
		
		
	}

}
