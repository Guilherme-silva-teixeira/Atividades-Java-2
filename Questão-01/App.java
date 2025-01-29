public class App
{
    public static void main(String[] args)
    {
        Funcionario f1 = new Funcionario("Carlos", 30, 3000.00);
        Gerente g1 = new Gerente("Mariana", 40, 7000.00, 2000.00);

        f1.exibirInfo();
        g1.exibirInfo();
    }
}
