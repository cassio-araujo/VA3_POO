
public class Arma {

	String nome;
	TipoArma tipo;
	int poderDeAtaque;

	Arma(String nome, int poderDeAtaque, TipoArma tipo) {
		this.nome = nome;
		this.poderDeAtaque = poderDeAtaque;
		this.tipo = tipo;
	}
	
	int danoDaArma() {
		int dano = 0;
		if(this.tipo == TipoArma.Espada) {
			dano = poderDeAtaque * 2;
		} else if (this.tipo == TipoArma.Machado) {
			dano = poderDeAtaque * 3;
		} else if (this.tipo == TipoArma.ArcoeFlecha) {
			dano = poderDeAtaque;
		}

		System.out.println("Dano causado: " + dano);
		return dano;
	}
	
}
