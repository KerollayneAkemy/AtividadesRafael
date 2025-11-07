package Aula0711;

public class ContaBancaria {

    private double saldo;
    private double limite;

    public ContaBancaria(double valorSaldo, double valorLimite) {
        this.saldo = valorSaldo;
        this.limite = valorLimite;
    }

    public double getSaldo() {
        return saldo;
    }

    protected double getLimite() {
        return limite;
    }

    public double getSaldoComLimite() {
        return saldo + limite;
    }

    public boolean sacar(double valor) throws ContaException {
        if (valor > 500) {
            throw new ContaException("Erro: o valor do saque não pode ser superior a R$500,00.");
        }

        if ((saldo + limite) - valor < 0) {
            throw new ContaException("Erro: saldo insuficiente para realizar o saque.");
        }

        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        return true;
    }

    public void depositar(double valor) throws ContaException {
        if (valor > 1000) {
            throw new ContaException("Erro: o valor do depósito não pode ser superior a R$1.000,00.");
        }

        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
    }
}
