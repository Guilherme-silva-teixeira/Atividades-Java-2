class Gerente extends Funcionario
{
    private double bonus;

    public Gerente(String nome, int idade, double salario, double bonus)
    {
        super(nome, idade, salario);
        this.bonus = bonus;
    }

    @Override
    public void exibirInfo()
    {
        System.out.println("Gerente: " + nome + ", Idade: " + idade + ", Salário: R$" + salario + ", Bônus: R$" + bonus);
    }
}