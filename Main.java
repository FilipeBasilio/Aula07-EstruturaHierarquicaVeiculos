public class Main {
    public static void main(String[] args) {
        Veiculo bike = new Bicicleta();
        Veiculo carro = new Automovel();

        bike.acelerar(15);
        bike.parar();

        carro.acelerar(80);
        carro.parar();

        // Cast para acessar método específico da classe Automovel
        ((Automovel) carro).mudarOleo(3.5f);
    }
}
