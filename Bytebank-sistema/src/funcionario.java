public abstract class funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private static int total;

    public funcionario(String nome, String cpf, double salario){
        total++;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }


    public static int getTotal() {
        return total;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getNome() {
        return this.nome;
    }
    public abstract double getBonificacao();

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario + this.getBonificacao();
    }
}
