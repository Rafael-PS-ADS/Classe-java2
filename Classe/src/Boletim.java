public class Boletim {
    public double calcularMedia(Notas notas) {
        return (notas.notas1 + notas.notas2 + notas.notas3) / 3;
    }

    public String verificarSituacao(double media) {
        if (media >= 6.0) {
            return "Aprovado";
        } else if (media >= 5.0) {
            return "Recuperação";
        } else if (media >=3.0) {
            return "Reprovado";
        } else {
            return "Erro de cálculo";
        }
    }
}