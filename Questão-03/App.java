import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//===============================CLASSES COM JFRAME===========================

class EmpresaGUI extends JFrame
{
    private ArrayList<Funcionario> funcionarios;
    private JTextArea displayArea;
    
    //===============================CONSTRUTOR
    public EmpresaGUI()
    {
        funcionarios = new ArrayList<>();

        setTitle("Cadastro de Funcionários");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton btnAdicionarFuncionario = new JButton("Adicionar Funcionário");
        JButton btnAdicionarGerente = new JButton("Adicionar Gerente");
        JButton btnExibirFuncionarios = new JButton("Exibir Lista");

        displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        btnAdicionarFuncionario.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                adicionarFuncionario();
            }
        });

        btnAdicionarGerente.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                adicionarGerente();
            }
        });

        btnExibirFuncionarios.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                exibirFuncionarios();
            }
        });

        add(btnAdicionarFuncionario);
        add(btnAdicionarGerente);
        add(btnExibirFuncionarios);
        add(scrollPane);
    }

    //===============================ADD FUNCIONARIO

    private void adicionarFuncionario()
    {
        String nome = JOptionPane.showInputDialog("Nome do Funcionário:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));

        Funcionario f = new Funcionario(nome, idade, salario);
        funcionarios.add(f);
        JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso!");
    }

    //===============================ADD GERENTE

    private void adicionarGerente()
    {
        String nome = JOptionPane.showInputDialog("Nome do Gerente:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));
        double bonus = Double.parseDouble(JOptionPane.showInputDialog("Bônus:"));

        Gerente g = new Gerente(nome, idade, salario, bonus);
        funcionarios.add(g);
        JOptionPane.showMessageDialog(this, "Gerente cadastrado com sucesso!");
    }

    private void exibirFuncionarios()
    {
        displayArea.setText("");
        if (funcionarios.isEmpty())
        {
            displayArea.append("Nenhum funcionário cadastrado.\n");
        }
        else 
        {

            for (Funcionario f : funcionarios)
            {
                displayArea.append(f.toString() + "\n");
            }

            //foreach (Funcionario f : funcionarios)
            
        }
    }
}

//===============================MAIN===========================
public class App
{
    public static void main(String[] args)
    {
        new EmpresaGUI().setVisible(true);
    }
}
