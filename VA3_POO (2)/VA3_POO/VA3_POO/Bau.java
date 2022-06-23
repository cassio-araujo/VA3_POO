public class Bau extends Tesouro {
  int multiplicador;

  Bau(String tipo, float valor, int multiplicador) {
    this.tipo = tipo;
    this.valor = valor;
    this.multiplicador = multiplicador;
  }


  public float calcularQuantidade() {
    return this.valor * this.multiplicador;
  }
}