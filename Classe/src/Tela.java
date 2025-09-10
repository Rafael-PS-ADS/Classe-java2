import java.util.Scanner;

public class Tela {
    private Scanner scanner = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("Bem-vindo ao sistema de cálculo de média!");
    }

    public double pedirDouble(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public void mostrarResultado(double media, String situacao) {
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Situação: " + situacao);
    }
}