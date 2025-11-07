package PROJETO;

public class Funcao {

    public void brincar(Animal a) {
        a.setFelicidade(a.getFelicidade() + 15);
        a.setEnergia(a.getEnergia() - 10);
        a.setHigiene(a.getHigiene() - 5);
        System.out.println("\n🎾 " + a.getNome() + " se divertiu muito brincando!");
        validar(a);
    }

    public void dormir(Animal a) {
        a.setEnergia(a.getEnergia() + 30);
        a.setSaude(a.getSaude() + 10);
        a.setFelicidade(a.getFelicidade() + 5);
        System.out.println("\n💤 " + a.getNome() + " dormiu e acordou renovado!");
        validar(a);
    }

    public void comer(Animal a) {
        a.setSaude(a.getSaude() + 20);
        a.setEnergia(a.getEnergia() + 10);
        a.setHigiene(a.getHigiene() - 5);
        System.out.println("\n🍗 " + a.getNome() + " fez uma refeição deliciosa!");
        validar(a);
    }

    public void tomarBanho(Animal a) {
        a.setHigiene(a.getHigiene() + 40);
        a.setFelicidade(a.getFelicidade() - 5);
        System.out.println("\n🧼 " + a.getNome() + " tomou banho e ficou cheirosinho!");
        validar(a);
    }

    public void validar(Animal a) {
        if (a.getFelicidade() == 0) {
            a.setSaude(a.getSaude() - 15);
            System.out.println("\n⚠️  " + a.getNome() + " está muito triste e ficou doente!");
        }

        if (a.getEnergia() == 0) {
            a.setSaude(a.getSaude() - 10);
            System.out.println("\n⚠️  " + a.getNome() + " está exausto e perdeu saúde!");
        }

        if (a.getHigiene() == 0) {
            a.setSaude(a.getSaude() - 10);
            System.out.println("\n⚠️  " + a.getNome() + " está sujo e ficou doente!");
        }

        if (a.getSaude() <= 0) {
            System.out.println("\n💀 " + a.getNome() + " não resistiu e morreu...");
        }
    }
}
