package JogoAventura;

import java.util.Random;

public class Heroina {
	private String nome;
	private int nivel;
	private int hp;
	private int ataque;
	private int pocao; //novas vão sendo adicionadas 
	
	public Heroina () {
		this.nome = "";
		this.nivel = 1;
		this.hp = 100;
		this.ataque = 10;
		this.pocao = 3;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getNivel() {
		return nivel;
	}

	protected int getHp() {
		return hp;
	}
	
	protected void setHP(int hp) {
		this.hp = hp;
	}
	
	protected int getAtaque() {
		return ataque;
	}

	protected int getPocao() {
		return pocao;
	}
	
	protected void setPocao(int pocao) {
		this.pocao = pocao;
	}
	
	public void acaoHeroina (int opcao, Inimigo inimigo, Heroina heroina) {
		switch (opcao) {
		case 1:
			//batalha
			inimigo.setHP(heroina.ataqueHeroina(heroina));
			System.out.println(inimigo.getNome()+" HP: "+inimigo.getHp());
			break;
			
		case 2:
			//Beber pocao
			if (heroina.getPocao()>0) {
				heroina.setPocao(heroina.getPocao()-1);
				heroina.setHP(heroina.getHp()+2);
			} else {
				System.out.println("Não tem mais poção para usar!");
			}
			break;
			
		case 3:
			//Fugir (RUN)
			System.out.println("Você fugiu!");
			System.exit(0);
		default:
			System.out.println("Opção Inválida!");				
		}
	}
	
	public int ataqueHeroina(Heroina heroina) {
		Random aleatorio = new Random();
		
		return heroina.ataque + aleatorio.nextInt(20) +1;

	}
	
	public int heroinaRecebeAtaque(int ataqueRecebido) {
		return hp -= ataqueRecebido;
	}
	
	
}
