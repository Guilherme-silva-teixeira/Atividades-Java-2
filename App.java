import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Carlos", 30, 3000.00));
        funcionarios.add(new Gerente("Mariana", 40, 7000.00, 2000.00));
        funcionarios.add(new Funcionario("Julia", 25, 2500.00));
        funcionarios.add(new Gerente("Roberto", 50, 8000.00, 3000.00));

        for (Funcionario f : funcionarios)
        {
            f.exibirInfo();
            f.calcularPagamento();
            System.out.println();
        }
    }
}