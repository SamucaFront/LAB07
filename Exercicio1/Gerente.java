public class Gerente extends Funcionario {
    private String departamento;
    private double bonificacaoPercentual;

    public Gerente(String nome, String cpf, double salarioBase, String departamento, double bonificacaoPercentual) {
        super(nome, cpf, salarioBase);
        this.departamento = departamento;
        this.bonificacaoPercentual = bonificacaoPercentual;
    }

    public double calcularSalarioTotal() {
        return salarioBase + (salarioBase * (bonificacaoPercentual / 100));
    }
}