public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("João", "111.111.111-11", 3000);
        Gerente g = new Gerente("Maria", "222.222.222-22", 5000, "TI", 20);
        Desenvolvedor d = new Desenvolvedor("Carlos", "333.333.333-33", 4000, "Java", 1500);

        System.out.println("Salário Funcionário: " + f.calcularSalarioTotal());
        System.out.println("Salário Gerente: " + g.calcularSalarioTotal());
        System.out.println("Salário Desenvolvedor: " + d.calcularSalarioTotal());
    }
}