package SistemaPedagio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> fila = new ArrayList<>();
        double totalArrecadado = 0;

        int opcao;

        do {
            System.out.println("\n=== ECO TOLL – SISTEMA DE PEDÁGIO ==="
            		+ "\n1 - Registrar Carro "
            		+ "\n2 - Registrar Caminhão "
            		+ "\n3 - Registrar Viatura (isenta)"
            		+ "\n4 - Processar pedágio"
            		+ "\n0 - Sair"
            		+ "\nEscolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            try {

                switch (opcao) {

                    case 1 -> {
                        System.out.println("\n--- CADASTRO DE CARRO ---");
                        System.out.print("Placa: ");
                        String placa = sc.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();
                        System.out.print("Velocidade: ");
                        int vel = sc.nextInt();

                        fila.add(new Carro(placa, modelo, vel));
                        System.out.println("✔ Carro registrado com sucesso!");
                    }

                    case 2 -> {
                        System.out.println("\n--- CADASTRO DE CAMINHÃO ---");
                        System.out.print("Placa: ");
                        String placa = sc.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();
                        System.out.print("Velocidade: ");
                        int vel = sc.nextInt();
                        System.out.print("Quantidade de eixos: ");
                        int eixos = sc.nextInt();

                        fila.add(new Caminhao(placa, modelo, vel, eixos));
                        System.out.println("✔ Caminhão registrado com sucesso!");
                    }

                    case 3 -> {
                        System.out.println("\n--- CADASTRO DE VIATURA ---");
                        System.out.print("Placa: ");
                        String placa = sc.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();
                        System.out.print("Velocidade: ");
                        int vel = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Tipo (Polícia / Bombeiro / SAMU): ");
                        String tipo = sc.nextLine();

                        fila.add(new Viatura(placa, modelo, vel, tipo));
                        System.out.println("✔ Viatura registrada (isenta)!");
                    }

                    case 4 -> {
                        if (fila.isEmpty()) {
                            System.out.println("\nNenhum veículo registrado!");
                            break;
                        }

                        System.out.println("\n=== PROCESSANDO PEDÁGIO ===");

                        for (Veiculo v : fila) {
                            v.exibirInformacoes();

                            if (v instanceof Pagavel p) {
                                double valor = p.calcularTarifa();
                                System.out.println("→ Pagou pedágio: R$ " + valor);
                                totalArrecadado += valor;
                            } else {
                                System.out.println("→ ISENTO (Viatura oficial)");
                            }

                            System.out.println("-----------------------------");
                        }

                        System.out.println("TOTAL ARRECADADO: R$ " + totalArrecadado);
                        fila.clear();
                    }

                    case 0 -> System.out.println("\nEncerrando o sistema...");

                    default -> System.out.println("⚠Opção inválida!");
                }

            } catch (VelocidadeExcedidaException e) {
                System.out.println("\n🚨 ERRO: " + e.getMessage());
            }

        } while (opcao != 0);

        sc.close();
    }
}