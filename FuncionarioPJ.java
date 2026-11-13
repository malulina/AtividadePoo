
public class FuncionarioPJ extends Funcionario {

    private double valorHora;
    private double horasTrabalhadas;

    public FuncionarioPJ(String nome, double valorHora, double horasTrabalhadas) {
        this(nome, valorHora, horasTrabalhadas, true);
    }

    protected FuncionarioPJ(String nome, double valorHora, double horasTrabalhadas, boolean pj) {
        super(nome, 0.0, pj);

        if (valorHora < 0 || horasTrabalhadas < 0) {
            throw new IllegalArgumentException("Hora e quantidade invalidas.");
        }

        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularBruto() {
        return arredondar(valorHora * horasTrabalhadas);
    }

    @Override
    public double calcularMEI() {
        if (!isPJ()) {
            return 0;
        }

        return 86.05;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
}
