package com.aula1;

public class SmartTv {
	
	boolean ligada = false;
	int canal = 1 ;
	int volume = 25;
	
	//Metodo para ligar a SmartTV
	public void ligar() {
		ligada = true;	
	}
	//Metodo para desligar a SmartTV
	public void desligar() {
		ligada = false;
		
	}
	//Metodo para aumnetar a SmartTV
	public void aumentarVolume() {
	
		volume = volume + 1;
	}
	//Metodo para baixar a SmartTV
	public void baixarVolume() {
		volume = volume - 1;
	}
	//Metodo para aumentar o canal da SmartTV
	public void aumentarCanal() {
		canal = canal + 1;
	}
	//Metodo para baixar o canal da SmartTV
	public void baixarCanal() {
		canal = canal - 1;
	}
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
}
