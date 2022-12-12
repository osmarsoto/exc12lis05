import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static String embaralheApalavra(List<String> embaralhamento_de_palavra, String palavra_preferência) {
        Collections.shuffle(embaralhamento_de_palavra);
        StringBuilder saida = new StringBuilder(palavra_preferência.length());

        saida.append("Após o embaralhamento, sua palavra ficou dessa forma: ");

        for (String a : embaralhamento_de_palavra) {
            saida.append(a);
        }

        return saida.toString();
    }

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a palavra de sua preferência: ");
        String palavra = teclado.nextLine();
        List<String> embaralhar = Arrays.asList(palavra.split(""));
        System.out.println(embaralheApalavra(embaralhar, palavra));
        teclado.close();

    }
}