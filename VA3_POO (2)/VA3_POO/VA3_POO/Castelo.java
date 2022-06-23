
public class Castelo {

	int poderDeDefesa;
	int vida;

	Castelo (int poderDeDefesa, int vida){
		this.poderDeDefesa = poderDeDefesa;
		this.vida = vida;
	}
	
	boolean receberAtaque(int ataque) {
		this.vida -= ataque;
		return true;
	}
	
}
