// Criando a classe filha Herois
public class herois extends personagens
{

    // Criando o método construtor herois
    public herois(String nome, int vida, int dano) {
        super(nome, vida, dano);
    }


    // Criando o método ataque
    @Override
    public void ataque(int vida1, int vida2, int dano1 , int dano2,int aleatorio, String nome1, String nome2)
    {
        // Estrutura de repetição do ataque
        while (vida1 > 0 && vida2 > 0)
        {
            // Ataque do personagem 1
            if (vida1 < vida2)
            {
                vida2 -= dano1;
                System.out.println(nome1 + " ataca " + nome2 + " e causa " + dano1 + " de dano" + "\n" + "Vida " + nome1 + ": " + vida1 + "\n" + "Vida " + nome2 + ": " + vida2 + "\n");
            }
            // Ataque do personagem 2
            else if (vida2 < vida1)
            {
                vida1 -= dano2;
                System.out.println(nome2 + " ataca " + nome1 + " e causa " + dano2 + " de dano" + "\n" + "Vida " + nome1 + ": " + vida1 + "\n" + "Vida " + nome2 + ": " + vida2 + "\n");
            }
            // Condição que decide quem começa a rodada de ataques
            else if (vida1 == vida2)
            {
                // Caso o número seja 0 o personagem 1 começa atacando
                if (aleatorio == 0) {
                    vida2 -= dano1;
                    System.out.println(nome1 + " ataca " + nome2 + " e causa " + dano1 + " de dano" + "\n" + "Vida " + nome1 + ": " + vida1 + "\n" + "Vida " + nome2 + ": " + vida2 + "\n");
                }
                // Caso o número seja 1 o personagem 2 começa atacando
                else if (aleatorio == 1)
                {
                    vida1 -= dano2;
                    System.out.println(nome2 + " ataca " + nome1 + " e causa " + dano2 + " de dano" + "\n" + "Vida " + nome1 + ": " + vida1 + "\n" + "Vida " + nome2 + ": " + vida2 + "\n");
                }
            }
        }

        if (vida1 <= 0)
        {
            System.out.println(nome2 + " venceu a batalha !!!");
        }
        else if (vida2 <= 0)
        {
            System.out.println(nome1 + " venceu a batalha !!!");
        }
    }
}
