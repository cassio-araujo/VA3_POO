public class Ouro extends Tesouro {
  
  Ouro(String tipo, float valor) {
    this.tipo = tipo;
    this.valor = valor;
  }

  public float calcularQuantidade() {
    return this.valor;
  }
}