public class contaCorrente extends conta implements tributavel{
    
    
    public contaCorrente(int agencia, int numero){
        super(agencia, numero);
    }
    public void depositar(double valor){
        super.saldo += valor;

    }

    public void transferir(double valor, conta destino){
        this.sacar(valor + 0.2);
        destino.depositar(valor);
    }
    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
