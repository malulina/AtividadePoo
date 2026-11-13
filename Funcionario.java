
public class Funcionario {

    private String nome;
    private double salarioMensal;
    private final boolean pj;

    public Funcionario(String nome, double salarioMensal) {
        this(nome, salarioMensal, false);
    }

    protected Funcionario(String nome, double salarioMensal, boolean pj) {
        if (nome == null || nome.isBlank() || salarioMensal < 0) {
            throw new IllegalArgumentException("Nome e salario invalidos.");
        }

        this.nome = nome;
        this.salarioMensal = salarioMensal;
        this.pj = pj;
    }

    public boolean isPJ() {
        return pj;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public double calcularBruto() {
        return salarioMensal;
    }


public double calcularIRRF() {
    if (isPJ()) {
        return 0;
    }

    double salario = calcularBruto();
    double deducao = Math.max(calcularINSS(), 607.20);
    double base = Math.max(0, salario - deducao);
    double irrf;

    if (base <= 2428.80) {
        irrf = 0;
    } else if (base <= 2826.65) {
        irrf = base * 0.075 - 182.16;
    } else if (base <= 3751.05) {
        irrf = base * 0.15 - 394.16;
    } else if (base <= 4664.68) {
        irrf = base * 0.225 - 675.49;
    } else {
        irrf = base * 0.275 - 908.73;
    }

    irrf = arredondar(Math.max(0, irrf));

    double reducao = 0;

    if (salario <= 5000.00) {
        reducao = irrf;
    } else if (salario <= 7350.00) {
        reducao = Math.max(0, 978.62 - 0.133145 * salario);
    }

    reducao = arredondar(reducao);

    return arredondar(Math.max(0, irrf - reducao));
}


    
public double calcularINSS() {
    if (isPJ()) {
        return 0;
    }

    double salario = calcularBruto();
    double inss;

    if (salario <= 1621.00) {
        inss = salario * 0.075;
    } else if (salario <= 2902.84) {
        inss = 1621.00 * 0.075
                + (salario - 1621.00) * 0.09;
    } else if (salario <= 4354.27) {
        inss = 1621.00 * 0.075
                + 1281.84 * 0.09
                + (salario - 2902.84) * 0.12;
    } else if (salario <= 8475.55) {
        inss = 1621.00 * 0.075
                + 1281.84 * 0.09
                + 1451.43 * 0.12
                + (salario - 4354.27) * 0.14;
    } else {
        inss = 1621.00 * 0.075
                + 1281.84 * 0.09
                + 1451.43 * 0.12
                + 4121.28 * 0.14;
    }

    return arredondar(inss);
}


    public double calcularFGTS() {
        if (isPJ()) {
            return 0;
        }

        return arredondar(calcularBruto() * 0.08);
    }

    public double calcularMEI() {
        return 0;
    }

    public double calcularLiquido() {
        return arredondar(calcularBruto() - calcularINSS()
                - calcularIRRF() - calcularMEI());
    }

    protected double arredondar(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }
}
