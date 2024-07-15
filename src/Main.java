import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Instanciando os obejetos personagens de acordo com a sua classe filha
        herois naruto = new herois("Naruto",1000, 150);
        viloes kakuzu = new viloes("Kakuzu", 1000, 125);

        // Declarando as variáveis
        String nomeKakuzu = kakuzu.getNome();
        String nomeNaruto = naruto.getNome();
        int vidaNaruto = naruto.getVida();
        int vidaKakuzu = kakuzu.getVida();
        int danoNaruto = naruto.getDano();
        int danoKakuzu = kakuzu.getDano();

        // Instanciando objeto da classe Random
        Random aleatorio = new Random();
        int numAleatorio = aleatorio.nextInt(2);

        naruto.ataque(vidaNaruto,vidaKakuzu,danoNaruto,danoKakuzu,numAleatorio, nomeNaruto, nomeKakuzu);



    }
}