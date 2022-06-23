import java.util.ArrayList;

public class Jogador {

	String nome;
	String raca;
	Castelo castelo;
	Arma arma;
	
	ArrayList<Tesouro> tesouros = new ArrayList<Tesouro>();
	
	ArrayList<Masmorra> masmorrasVisitadas = new ArrayList<Masmorra>();

	Jogador(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}
	

	public float calcularTotal() {
		Float total = (float) 0.00;
		for(int x = 0; x < tesouros.size(); x++) {
			total += tesouros.get(x).calcularQuantidade();
		}
		System.out.println("Total de tesouros: " + total);
		return total;
	}

	public float retornarTesouroMaiorValor() {
		Float maior = (float) 0.00;
		for(int x = 0; x < tesouros.size(); x++) {
			if (maior < tesouros.get(x).calcularQuantidade())
			maior = tesouros.get(x).calcularQuantidade();
		}
		System.out.println("Maior tesouro: " + maior);
		return maior;
	}

	public void setarArma(String nome, int poderDeAtaque, TipoArma tipo) {
		arma = new Arma(nome, poderDeAtaque, tipo);
	}

	public void setarCastelo(int poderDeDefesa, int vida) {
		castelo = new Castelo(poderDeDefesa, vida);
	}

	public void adicionarBau(String tipo, float valor, int multiplicador) {
		this.tesouros.add(new Bau(tipo, valor, multiplicador));
	}

	public void adicionarOuro(String tipo, float valor) {
		this.tesouros.add(new Ouro(tipo, valor));
	}


	public void adicionarMasmorra(String nome, String nivelDeDificuldade, int ouroASerEncontrado) {
		this.masmorrasVisitadas.add(new Masmorra(nome, nivelDeDificuldade, ouroASerEncontrado));
	}

	public void detalheMasmorra(int mas) {
		this.masmorrasVisitadas.get(mas).relatorio();
	}
	
}
