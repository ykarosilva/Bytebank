public class testaGetSet {
    public static void main(String[] args) {
        contaCorrente conta = new contaCorrente(1337, 12832);
        conta conta2 = new contaPoupança(1337, 12389);
        conta conta3 = new contaCorrente(1337, 12371);
        
        

        cliente ykaro = new cliente();

        conta.setTitular(ykaro);
        conta2.setTitular(ykaro);
        conta3.setTitular(ykaro);

        conta.depositar(200);
        conta2.depositar(300);
        conta.transferir(200, conta3);
        System.out.println(conta2.saldo);
        System.out.println(conta.saldo);
        System.out.println(conta3.saldo);
        seguroDeVida seg = new seguroDeVida();

        calculadorDeImposto cal = new calculadorDeImposto();
        cal.registro(seg);
        cal.registro(conta);

        System.out.println(cal.getTotalImposto());

    }
}
