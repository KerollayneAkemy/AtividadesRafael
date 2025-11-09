package Aula0711;

public class TesteConta {
	    public static void main(String[] args) {
	        ContaBancaria conta = new ContaBancaria(300, 200);

	        try {
	            System.out.println("Saldo inicial: R$" + conta.getSaldo());
	            System.out.println("Saldo com limite: R$" + conta.getSaldoComLimite());

	            conta.depositar(500);
	            System.out.println("Saldo após depósito: R$" + conta.getSaldo());

	            conta.sacar(200);
	            System.out.println("Saldo após saque: R$" + conta.getSaldo());

	            conta.depositar(1500);
	        } catch (ContaException e) {
	            System.out.println(e.getMessage());
	        }

	        try {
	            conta.sacar(600);
	        } catch (ContaException e) {
	            System.out.println(e.getMessage());   
	        }
	    }
	}
