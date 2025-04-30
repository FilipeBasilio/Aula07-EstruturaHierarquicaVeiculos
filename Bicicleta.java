public class Bicicleta extends Veiculo {
    @Override
    public float acelerar(float velocidade) {
        System.out.println("Bicicleta acelerando a " + velocidade + " km/h.");
        return velocidade;
    }

    @Override
    public void parar() {
        System.out.println("Bicicleta parou.");
    }
}
