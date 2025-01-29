class Funcionario extends Pessoa implements Trabalhador
{
    protected double salario;

    public Funcionario(String nome, int idade, double salario)
    {
        super(nome, idade);
        this.salario = salario;
    }

    @Override
    public void exibirInfo()
    {
        System.out.println("Funcionário: " + nome + ", Idade: " + idade + ", Salário: R$" + salario);
    }

    @Override
    public void calcularPagamento()
    {
        System.out.println(nome + " recebe um salário fixo de R$" + salario);
    }
}