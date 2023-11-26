public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoMinutos = 189;
        meuFilme.avaliacao = 9;
        meuFilme.inclusoNoPlano = true;
        meuFilme.totalAvaliacoes = 5;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);
    }
}