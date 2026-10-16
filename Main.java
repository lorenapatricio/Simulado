import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_FASES = 96;
        final double VALOR_HORA_ENERGIA = 5.0;
        final int TEMPO_FACIL = 1; // 1 hora por fase facil
        final int TEMPO_DIFICIL = 2; // 2 horas por fase dificil

        int fasesFaceis = scanner.nextInt();

        int fasesDificeis = TOTAL_FASES - fasesFaceis;

        int horasFaceis = fasesFaceis * TEMPO_FACIL;

        int horasDificeis = fasesDificeis * TEMPO_DIFICIL;

        int totalHoras = horasFaceis + horasDificeis;

        double valorTotal = totalHoras * VALOR_HORA_ENERGIA;

        System.out.println("Quantidade fases faceis: " + fasesFaceis);
        System.out.println("Quantidade fases dificeis: " + fasesDificeis);
        System.out.println("Horas nas fases faceis: " + horasFaceis);
        System.out.println("Horas nas fases dificeis: " + horasDificeis);
        System.out.println("Total de horas gastas ate concluir o jogo: " + totalHoras);
        
        String valorFormatado = String.format("R$ %.2f", valorTotal).replace('.', ',');
        System.out.println("Valor em reais da jogatina: " + valorFormatado);

        scanner.close();
    }
}