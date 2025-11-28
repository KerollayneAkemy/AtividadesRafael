package SistemaPedagio;

public abstract class Veiculo {

    protected String placa;
    protected String modelo;
    protected int velocidadeAtual;

    public Veiculo(String placa, String modelo, int velocidadeAtual)
            throws VelocidadeExcedidaException {

        if (velocidadeAtual > 100) {
            throw new VelocidadeExcedidaException(velocidadeAtual);
        }

        this.placa = placa;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void exibirInformacoes() {
        System.out.println("Veículo: " + modelo +
                           " | Placa: " + placa +
                           " | Velocidade: " + velocidadeAtual + " km/h");
    }
}
