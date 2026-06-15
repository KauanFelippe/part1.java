import java.util.Scanner;
import javax.swing.JOptionPane;
public class main {

    public static void main(String[] args) {
        JOptionPane.showMenssagemDialog(
            null,
            "Sistema do evento"
        );
        
        Scanner entrada = new Scanner(System.in);


        System.out.println("=== Evento 1 ===");
        System.out.print("Digite o codigo: ");
        int codigo1 = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Nome do evento: ");
        String nome1 = entrada.nextLine();

        System.out.print("Local: ");
        String local1 = entrada.nextLine();

        System.out.print("Valor do ingresso ");
        double ingresso1 = entrada.nextDouble();
        
        System.out.print("Quantidade de vagas (true/false)");
        boolean vagas1 = entrada.nextBoolean();

        System.out.print("Carga horaria ");
        double horario1 = entrada.nextLine();

        Funcionario estoque1 = new Funcionario(
            codigo1, nome1, local1, ingresso1, vagas1, horario1, horario1);

        // evento 2
        System.out.println("=== Evento 2 ===");
        System.out.print("Digite o codigo: ");
        int codigo2 = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Nome do evento: ");
        String nome2 = entrada.nextLine();

        System.out.print("local: ");
        String local2 = entada.nextLine();

        System.out.print("Valor do ingresso: ");
        double ingresso2 = entrada.nextDouble();

        System.out.print("Quantidade de vagas: (true/false)");
        boolean vagas2 = entrada.nextBoolean();

        System.out.print("Carga horaria: ");
        double horario2 = entrada.nextDouble();

        Funcionario estoque2 = new Funcionario(
            codigo2, nome2, local2, ingresso2, vagas2, horario2);


        // Evento 3
        System.out.println("=== Evento 3 ===");
        System.out.print("Digite o codigo: ");
        int codigo3 = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Nome do evento: ");
        String nome3 = entrada.nextLine();

        System.out.print("local: ");
        String local3 = entrada.nextLine();

        System.out.print("Valor do ingresso: ");
        double ingresso3 = entrada.nextDouble();

        System.out.print("Quantidade de vagas: (true/false)");
        boolean vagas3 = entrada.nextBoolean();

        System.out.print("Carga horaria: ");
        double horario3 = entrada.nextDouble();

        Funcionario estoque3 = new Funcionario(
            codigo3, nome3, local3, ingresso3, vagas3, horario3);


        //Exibição de Dados
        System.out.println("\n=== Evento 1 ===");
        estoque1.exibirDados();
        System.out.println("Produto pode ser vendido? " + estoque1.quantidadeEmEstoque());
        System.out.println("Produto pode receber desconto? " + estoque1.podeReceberDesconto());


        System.out.println("\n=== Evento 2 ===");
        estoque2.exibirDados();
        System.out.println("Produto pode ser vendido? " + estoque2.quantidadeEmEstoque());
        System.out.println("Produto pode receber desconto? " + estoque2.podeReceberDesconto());


        System.out.println("\n=== Evento 3 ===");
        estoque3.exibirDados();
        System.out.println("Produto pode ser vendido? " + estoque3.quantidadeEmEstoque());
        System.out.println("Produto pode receber desconto? " + estoque3.podeReceberDesconto());

        entrada.close();
    }
}