# AtividadePoo

1. Qual é a diferença entre classe e objeto? Identifique dois objetos do seu programa.

A classe é como um modelo usado para criar objetos. O objeto é criado a partir dela. No programa tenho objetos criados com new Funcionario() e new FuncionarioPJ()

2. O que o construtor garante na criação? Por que o regime não tem setter?

O construtor verifica se os dados estão corretos antes de criar o funcionário

3. Por que o FGTS aparece no demonstrativo, mas não reduz o líquido?

Porque o FGTS é pago pela empresa não é descontado do salário do funcionário, por isso aparece no resultado, mas não diminui o salário líquido.

4. Qual método foi sobrescrito? O que acontece quando o cálculo de INSS chama esse método em um professor?

O método calcularBruto() foi sobrescrito na classe Professor, quando o INSS chama esse método o java usa o cálculo do professor, considerando as horas semanais, o valor da hora-aula e o fator 4,5

5. Por que um professor CLT herdar de uma classe chamada FuncionarioPJ causa um problema de modelagem? Sugira um nome ou uma organização melhor para compartilhar o cálculo por hora, sem precisar implementar.

O professor é CLT mas herda de uma classe que representa um funcionário PJ. Uma opção seria criar uma classe chamada FuncionarioPorHora que poderia ser usada tanto pelo professor quanto pelo funcionário PJ


