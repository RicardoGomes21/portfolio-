// Criando a classe pai personagens
public abstract class personagens {

   // Declarando os atributos da classe
   private String nome;
   private int vida;
   private int dano;


    // Criando o método construtor
    public personagens(String nome, int vida, int dano) {

        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    public int getVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }

    // Criando o método ataque
    public abstract void ataque(int vida1, int vida2, int dano1, int dano2, int aleatorio, String nome1, String nome2);

}
