
public abstract class conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private cliente titular; 
    private static int total;

    public conta(int agencia, int numero){
        conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void depositar(double valor);

    public void sacar(double valor){
        if(this.saldo < valor){
            throw new SaldoInsulficienteException("Saldo:"+ this.saldo+", Valor: "+ valor);
        }
        this.saldo -= valor;
    }

    public abstract void transferir(double valor, conta destino);

    public double mostrarSaldo(){
        return this.saldo;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero; 
    }
    

    public int getAgencia() {
        return this.agencia;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public void setTitular(cliente titular) {
        this.titular = titular;
    }

    public cliente getTitular() {
        return this.titular;
    }
    public static int getTotal() {
        return conta.total;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}