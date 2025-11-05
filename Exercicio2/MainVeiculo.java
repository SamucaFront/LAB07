public class MainVeiculo {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 150.0, 4, "Gasolina");
        Moto moto = new Moto("Honda", "CG 160", 2023, 90.0, 160, "Elétrica");

        System.out.println("Custo locação carro (5 dias): R$ " + carro.calcularCustoLocacao(5));
        System.out.println("Custo locação moto (3 dias): R$ " + moto.calcularCustoLocacao(3));
    }
}