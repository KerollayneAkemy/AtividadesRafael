package PROJETO;

public class Animal {
    private String nome;
    private String tipo;
    private int energia;
    private int saude;
    private int felicidade;
    private int higiene;

    public Animal(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.energia = 80;
        this.saude = 80;
        this.felicidade = 80;
        this.higiene = 80;
    }

    // Getters
    public String getNome() { return nome; }
    public String getTipo() { return tipo; }
    public int getEnergia() { return energia; }
    public int getSaude() { return saude; }
    public int getFelicidade() { return felicidade; }
    public int getHigiene() { return higiene; }

    // Setters
    public void setEnergia(int energia) { this.energia = limitarValor(energia); }
    public void setSaude(int saude) { this.saude = limitarValor(saude); }
    public void setFelicidade(int felicidade) { this.felicidade = limitarValor(felicidade); }
    public void setHigiene(int higiene) { this.higiene = limitarValor(higiene); }

    private int limitarValor(int valor) {
        if (valor < 0) return 0;
        if (valor > 100) return 100;
        return valor;
    }

    public boolean estaVivo() {
        return saude > 0;
    }

    public void mostrarStatus() {
        System.out.println("\n══════════════════════════════════");
        System.out.println("🐾 Status de " + nome + " - (" + tipo + ")");
        System.out.println("❤️ Saúde:       " + saude + "/100");
        System.out.println("⚡ Energia:      " + energia + "/100");
        System.out.println("😊 Felicidade:  " + felicidade + "/100");
        System.out.println("🧼 Higiene:     " + higiene + "/100");
        System.out.println("══════════════════════════════════");
    }
}
