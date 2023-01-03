public class testaFuncionario {
    public static void main(String[] args) {
        gerente mafe = new gerente("Maria Fernanda Ceratti", "102.029.303.11", 10000, 2222);
        administrador ykaro = new administrador("Ykaro Silva", "078.582.551-77", 10000, 3333);

        System.out.println("R$"+mafe.getBonificacao()); 
        System.out.println("O salário da gerente é: "
        +(mafe.getBonificacao()+mafe.getSalario()));


        sistemaInterno si = new sistemaInterno();
        si.autentica(ykaro);
        si.autentica(mafe);


        System.out.println("R$"+ykaro.getBonificacao()); 
        System.out.println(ykaro.getSalario() + ykaro.getBonificacao());

    }
    
}
