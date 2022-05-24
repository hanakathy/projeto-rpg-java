package JogoAventura; //projeto dio

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner leitor = new Scanner(System.in);
		Heroina heroina =  new Heroina();
		Inimigo inimigo = new Inimigo(); //fazer lista com inimigos
		int op;
		Boolean hpHeroina=true, hpInimigo=true;
		Random aleatorio = new Random(); 
		
		//usuario colocar nome da heroina
		System.out.println("Digite seu nome:");
		heroina.setNome(leitor.next());
		
		while(heroina.getHp() > 0) {
			
			System.out.println("Parab�ns, "+heroina.getNome()+" por come�ar essa jornada!");
			
			System.out.println("Voc� tem 3 po��es, 1 espada e muita coragem de come�ar essa aventura.");
			
			System.out.println();
			System.out.println("========================================================");
			System.out.println();
			
			//Runtime.getRuntime().exec("clear"); //limpar o console
			
			//invocar inimigo 1
			op = aleatorio.nextInt(2) +1;			
			switch (op){
			case 1:			
				Inimigo vampiro = new Vampiro();
				inimigo = vampiro;
			case 2:
				Inimigo zumbi = new Zumbi();
				inimigo = zumbi;				
			case 3:
				
				Inimigo esqueleto = new Esqueleto();
				inimigo = esqueleto;	
			}
			
			System.out.println("Um "+ inimigo.getNome()+ " n�vel "+ inimigo.getNivel()+ " aparece!");			
			
			System.out.println();
			System.out.println("========================================================");
			System.out.println();
			
			//1a batalha
			do {
				//turno da heroina
				System.out.println("HP: "+ heroina.getHp()+" | Po��es: "+heroina.getPocao());
				System.out.println("O que deseja fazer?");
				System.out.println("1 - Atacar! \n2 - Beber 1 po��o! \n3 - Fugir!");
				op = leitor.nextInt();
				heroina.acaoHeroina(op, inimigo, heroina);
				
				System.out.println();
				
				//turno do inimigo
				inimigo.ataqueInimigo(inimigo, heroina);
				System.out.println("Voc� recebeu "+inimigo.ataque+" de ataque do inimigo!");
				
				System.out.println("Sua vez...");
				
				if(heroina.getHp()<=0) {
					hpHeroina = false;
				}else if(inimigo.getHp()<=0) {
					hpInimigo = false;
				}			
				
				System.out.println();
			} while(hpHeroina);
			
			
			//2a batalha
			do {
				//turno da heroina
				System.out.println("HP: "+ heroina.getHp()+" | Po��es: "+heroina.getPocao());
				System.out.println("O que deseja fazer?");
				System.out.println("1 - Atacar! \n2 - Beber 1 po��o! \n3 - Fugir!");
				op = leitor.nextInt();
				heroina.acaoHeroina(op, inimigo, heroina);
				
				System.out.println();
				
				//turno do inimigo
				inimigo.ataqueInimigo(inimigo, heroina);
				System.out.println("Voc� recebeu "+inimigo.ataque+" de ataque do inimigo!");
				
				System.out.println("Sua vez...");
				
				if(heroina.getHp()<=0) {
					hpHeroina = false;
				}else if(inimigo.getHp()<=0) {
					hpInimigo = false;
				}			
				
				System.out.println();
			} while(hpHeroina);
			
			//3a batalha
			do {
				//turno da heroina
				System.out.println("HP: "+ heroina.getHp()+" | Po��es: "+heroina.getPocao());
				System.out.println("O que deseja fazer?");
				System.out.println("1 - Atacar! \n2 - Beber 1 po��o! \n3 - Fugir!");
				op = leitor.nextInt();
				heroina.acaoHeroina(op, inimigo, heroina);
				
				System.out.println();
				
				//turno do inimigo
				inimigo.ataqueInimigo(inimigo, heroina);
				System.out.println("Voc� recebeu "+inimigo.ataque+" de ataque do inimigo!");
				
				System.out.println("Sua vez...");
				
				if(heroina.getHp()<=0) {
					hpHeroina = false;
				}else if(inimigo.getHp()<=0) {
					hpInimigo = false;
				}			
				
				System.out.println();
			} while(hpHeroina);			
		}
		System.out.println("Voc� morreu!");
		System.exit(0); //finalizar programa
	}

}
