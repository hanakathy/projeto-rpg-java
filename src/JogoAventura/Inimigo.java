package JogoAventura;

import java.util.Random;

public class Inimigo {
	protected static int NIVEL_INICIAL = 1;
	protected static int HP_INICIAL = 100;
	protected static int ATAQUE_INICIAL = 10;
	
	protected String nome;
	protected int nivel;
	protected int hp;
	protected int ataque;
	
	public Inimigo() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public int getNivel() {
		return nivel;
	}
	public int getHp() {
		return hp;
	}
	public int getAtaque() {
		return ataque;
	}
	protected void setHP(int hp) {
		this.hp = hp;
	}
	
	public int inimigoRecebeAtaque(int ataqueRecebido) {
		return hp -= ataqueRecebido;
	}
	
	public void ataqueInimigo(Inimigo inimigo, Heroina heroina) {
		Random aleatorio = new Random();
		int ataque = inimigo.ataque;
		
		ataque += aleatorio.nextInt(20) +1;
		heroina.heroinaRecebeAtaque(ataque); 
	}
}

class Esqueleto extends Inimigo{	
	public Esqueleto() {
		super.nome = "Esqueleto";
		super.nivel = NIVEL_INICIAL++;
		super.hp = HP_INICIAL + 50;
		super.ataque = ATAQUE_INICIAL + 5;
	}
}

class Zumbi extends Inimigo{
	public Zumbi() {
		super.nome = "Zumbi";
		super.nivel = NIVEL_INICIAL++;
		super.hp = HP_INICIAL + 50;
		super.ataque = ATAQUE_INICIAL + 5;
	}
}

class Vampiro extends Inimigo{
	public Vampiro() {
		super.nome = "Vampiro";
		super.nivel = NIVEL_INICIAL++;
		super.hp = HP_INICIAL + 50;
		super.ataque = ATAQUE_INICIAL + 5;
	}
}
