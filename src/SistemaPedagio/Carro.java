package SistemaPedagio;

public class Carro extends Veiculo implements Pagavel {

    public Carro(String placa, String modelo, int velocidadeAtual)
            throws VelocidadeExcedidaException {
        super(placa, modelo, velocidadeAtual);
    }

    @Override
    public double calcularTarifa() {
        return 7.00;
    }
}

