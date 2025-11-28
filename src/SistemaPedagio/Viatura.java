package SistemaPedagio;

public class Viatura extends Veiculo {

    private String tipo; // Polícia, Bombeiro, SAMU...

    public Viatura(String placa, String modelo, int velocidadeAtual, String tipo)
            throws VelocidadeExcedidaException {
        super(placa, modelo, velocidadeAtual);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}