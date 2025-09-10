public class App {
    public static void main(String[] args) throws Exception {
        Tela terminal = new Tela();
        Boletim bo = new Boletim();
        Notas notas = new Notas();

        // Entrada de dados
        terminal.apresentacao();
        notas.notas1 = terminal.pedirDouble("Digite a primeira nota: ");
        notas.notas2 = terminal.pedirDouble("Digite a segunda nota: ");
        notas.notas3 = terminal.pedirDouble("Digite a terceira nota: ");

        // Processando
        double media = bo.calcularMedia(notas);
        String situacao = bo.verificarSituacao(media);

        // Saída
        terminal.mostrarResultado(media, situacao);
    }
}