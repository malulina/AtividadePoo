
public class Professor extends FuncionarioPJ {

    public Professor(String nome, double valorHoraAula, double horasSemanais) {
        super(nome, valorHoraAula, horasSemanais, false);
    }

    @Override
    public double calcularBruto() {
        return arredondar(getValorHora() * getHorasTrabalhadas() * 4.5);
    }
}
