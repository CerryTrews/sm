import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("O poderoso chefão");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoMinutos(180);

        Filme filme2 = new Filme();
        filme2.setNome("Interstellar");
        filme2.setAnoDeLancamento(2020);
        filme2.setDuracaoMinutos(210);
        filme2.exibeFichaTecnica();
        filme2.avalia(10);
        filme2.avalia(10);
        filme2.avalia(10);
        System.out.println("Total de avaliações: " + filme2.getTotalAvaliacoes());
        System.out.println(filme2.pegaMedia());


        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        System.out.println("Total de avaliações: " + filme1.getTotalAvaliacoes());
        System.out.println(filme1.pegaMedia());

        Serie serie1 = new Serie();
        serie1.setNome("Lost");
        serie1.setAnoDeLancamento(2000);
        serie1.exibeFichaTecnica();
        serie1.setTemporadas(10);
        serie1.setEpisodioPorTemporada(10);
        serie1.setDuracaoEpisodio(50);

        System.out.println("Duração para maratonar Lost: " + serie1.getDuracaoEmMinutos() + " minutos");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        System.out.println(calculadora.getTempoTotal());
    }

}