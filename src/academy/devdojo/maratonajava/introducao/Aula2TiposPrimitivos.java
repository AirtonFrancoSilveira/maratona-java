package academy.devdojo.maratonajava.introducao;

public class Aula2TiposPrimitivos {
    public static void main(String[] args) {
        /*  Tipos Primitivos
            int, double, float, char, byte, short, long, boolean
         */
        int idadeDopai = 36;

        long numeroGrande = 1000000;
        double salarioDouble = 20000;
        float salarioFloat = 2500;
        byte idadeByte = -128; // o baite pod eir de -128 a 127
        short idadeShort = 10;
        boolean verdadeiroOrFalse = true;
        char caractere = 'A'; // here you can use table unicode Ex: char caractere = '\u0041';

        System.out.println("A idade é " + idadeDopai + " anos");
    }
}
