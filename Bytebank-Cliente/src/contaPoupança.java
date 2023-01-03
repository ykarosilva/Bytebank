public class contaPoupança extends conta{
    
    
    public contaPoupança(int agencia, int numero){
        super(agencia, numero);
    }
    @Override
    public void sacar(double valor) {
        super.sacar(valor + 0.2);
    }
    public void depositar(double valor){
        super.saldo += valor;
    }
    public void transferir(double valor, conta destino){
        this.saldo -= valor;
        destino.depositar(valor);
    }
}

