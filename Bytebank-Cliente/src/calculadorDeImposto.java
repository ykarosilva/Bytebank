public class calculadorDeImposto {

    private double totalImposto;

    public void registro(tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
