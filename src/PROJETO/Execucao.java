package PROJETO;

import java.util.Scanner;

public class Execucao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcao funcao = new Funcao();

        System.out.println("🌟 BEM-VINDO AO TAMAGOTCHI VIRTUAL 🌟");
        System.out.println("══════════════════════════════════");
        System.out.print("Digite o nome do seu bichinho: ");
        String nome = sc.nextLine();

        System.out.println("\nEscolha o tipo de bichinho:"
        		+ "\n[1] Cachorro"
        		+ "\n[2] Gato"
        		+ "\n[3] Papagaio"
        		+ "\nOpção: ");
        int tipo = sc.nextInt();

        Animal a;
        if (tipo == 1) {
            a = new Cachorro(nome);
        } else if (tipo == 2) {
            a = new Gato(nome);
        } else {
            a = new Papagaio(nome);
        }

        int escolha;
        
        do {
            if (!a.estaVivo()) {
                System.out.println("\n💔 Seu bichinho se foi... cuide melhor da próxima vez!");
                break;
            }

            a.mostrarStatus();

            System.out.println("\nO que deseja fazer agora?"
            		+ "\n[1] 🎾 Brincar"
            		+ "\n[2] 💤 Dormir ");
            System.out.println("[3] 🍗 Comer");
            System.out.println("[4] 🧼 Tomar banho");
            System.out.println("[0] ❌ Sair");
            System.out.print("Escolha: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1 -> funcao.brincar(a);
                case 2 -> funcao.dormir(a);
                case 3 -> funcao.comer(a);
                case 4 -> funcao.tomarBanho(a);
                case 0 -> System.out.println("\n👋 Até logo! Seu bichinho vai sentir sua falta!");
                default -> System.out.println("\n❌ Opção inválida! Tente novamente.");
            }

        } while (escolha != 0);

        sc.close();
    }
}
