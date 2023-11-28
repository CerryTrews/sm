public class Filme {
    String nome;
    int anoDeLancamento;
    boolean inclusoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    int duracaoMinutos;

    int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    void exibeFichaTecnica () {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
