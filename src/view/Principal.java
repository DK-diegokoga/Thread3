package view;
import controller.Thread3;

public class Principal {
	public static void main(String[] args) {
		
		int qtdeSapos = 5;	
		int Distancia = 10; //Tamanho da pista em Metros
		
		for (int i = 0; i < qtdeSapos ; i++) {
			Thread Sp_corre = new Thread3("O sapo_"+ i, Distancia);
			Sp_corre.start();
		}
	}
	
}