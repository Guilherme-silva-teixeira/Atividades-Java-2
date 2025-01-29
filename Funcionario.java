class Funcionario extends Pessoa
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
}