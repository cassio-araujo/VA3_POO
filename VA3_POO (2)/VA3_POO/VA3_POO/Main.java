
public class Main {

	public static void main(String[] args) {
		Jogador jogador = new Jogador("Nome 1", "raca 1");

		float valor = (float) 150.00;

		jogador.adicionarBau("tipo do tesouro 1", valor, 3);
		jogador.adicionarOuro("tipo do tesouro 2", valor);
		jogador.adicionarBau("tipo do tesouro 3", valor, 3);

		jogador.calcularTotal();
		jogador.retornarTesouroMaiorValor();

		jogador.setarArma("nome da arca", 10, TipoArma.ArcoeFlecha);
		jogador.setarCastelo(100, 200);

		jogador.adicionarMasmorra("nome da masmorra", "Nivel baixo", 1000);
		jogador.detalheMasmorra(0);

		jogador.castelo.receberAtaque(20);

	}

}
