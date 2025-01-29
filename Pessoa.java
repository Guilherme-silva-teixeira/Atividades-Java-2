//import java.util.ArrayList;

interface Trabalhador
{
    void calcularPagamento();
}

abstract class Pessoa
{
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void exibirInfo();
}