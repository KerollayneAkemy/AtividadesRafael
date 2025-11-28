package SistemaPedagio;

public class Caminhao extends Veiculo implements Pagavel {

	    private int eixos;

	    public Caminhao(String placa, String modelo, int velocidadeAtual, int eixos)
	            throws VelocidadeExcedidaException {
	        super(placa, modelo, velocidadeAtual);
	        this.eixos = eixos;
	    }

	    @Override
	    public double calcularTarifa() {
	        return eixos * 7.00;
	    }
	}