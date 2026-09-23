public class MainVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Argo", 4);
        Moto moto = new Moto("Honda", "CG 160", 160);

        carro.exibirDetalhes();
        System.out.println();
        moto.exibirDetalhes();
    }
}
