public class Funcionario {

    private int codigo;
    private String nome;
    private String local;
    private double ingresso;
    private boolean vagas;
    private double horario;


    public Funcionario(int codigo, String nome, String local, double ingresso, boolean vagas, double horario) {
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.ingresso = ingresso;
        this.vagas = vagas;
        this.horario = horario;
    }

    public void exibirDados() {
        System.out.println("O codigo é: " + codigo);
        System.out.println("Nome do produto: " + nome);
        System.out.println("Local do evento: " + local);
        System.out.println("Valor do ingresso: " + ingresso);
        System.out.println("Quantidade de vagas: " + vagas);
        System.out.println("Carga horaria: " + horario);
    }

    public boolean quantidadeEmEstoque() {
        return quantidade && String.valueOf(quantidade).lenght() > 0;
    }

    public boolean podeReceberDesconto() {
        return ingresso > 300;
    }
}
