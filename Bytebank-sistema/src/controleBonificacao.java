public class controleBonificacao {
    private double soma;


    public double getSoma() {
        return soma;
    }
    public void registra(funcionario f) {
        double bonificacao = f.getBonificacao();
        this.soma += bonificacao;
    }
}
