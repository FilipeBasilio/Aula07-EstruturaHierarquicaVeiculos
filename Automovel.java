public class Automovel extends Veiculo {
    @Override
    public float acelerar(float velocidade) {
        System.out.println("Automóvel acelerando a " + velocidade + " km/h.");
        return velocidade;
    }

    @Override
    public void parar() {
        System.out.println("Automóvel parou.");
    }

    public void mudarOleo(float litros) {
        System.out.println("Trocando o óleo do automóvel: " + litros + " litros adicionados.");
    }
}
