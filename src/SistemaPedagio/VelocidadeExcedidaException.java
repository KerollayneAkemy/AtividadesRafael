package SistemaPedagio;

public class VelocidadeExcedidaException extends Exception {

    public VelocidadeExcedidaException(int velocidade) {
        super("Velocidade excedida! (" + velocidade + " km/h). "
            + "Limite da via antes do pedágio: 100 km/h.");
    }
}



