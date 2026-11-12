# AtividadePoo

1. Qual é a diferença entre classe e objeto? Identifique dois objetos do seu programa.
A classe é como um modelo usado para criar objetos. O objeto é criado a partir dela. No meu programa, por exemplo, tenho objetos criados com new Funcionario() e new FuncionarioPJ().
2. O que o construtor garante na criação? Por que o regime não tem setter?
O construtor verifica se os dados estão corretos antes de criar o funcionário. O regime não tem setter porque ele é definido na criação e não deve ser alterado depois.
3. Por que o FGTS aparece no demonstrativo, mas não reduz o líquido?
Porque o FGTS é pago pela empresa, não é descontado do salário do funcionário. Por isso aparece no resultado, mas não diminui o salário líquido.
4. Qual método foi sobrescrito? O que acontece quando o cálculo de INSS chama esse método em um professor?
O método calcularBruto() foi sobrescrito na classe Professor. Quando o INSS chama esse método, o Java usa o cálculo do professor, considerando as horas semanais, o valor da hora-aula e o fator 4,5.
5. Por que um professor CLT herdar de uma classe chamada FuncionarioPJ causa um problema de modelagem? Sugira um nome ou uma organização melhor para compartilhar o cálculo por hora, sem precisar implementar.
Porque o professor é CLT, mas herda de uma classe que representa um funcionário PJ. Na prática, isso não faz muito sentido. Uma opção seria criar uma classe chamada FuncionarioPorHora, que poderia ser usada tanto pelo professor quanto pelo funcionário PJ.
