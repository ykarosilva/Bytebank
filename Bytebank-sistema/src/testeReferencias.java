public class testeReferencias {
    public static void main(String[] args) {
        gerente ykaro = new gerente("Ykaro Silva", "078.582.551-77", 10000.00, 1234);
        System.out.println(ykaro.autentica(1234));
        funcionario matheus = new editorVideo("Matheus", "1280938210938", 2500.00);
        funcionario enka = new editorVideo("Marcelo Alcantara", "102.120.564-32", 5000.00);

        controleBonificacao controle = new controleBonificacao();

        controle.registra(ykaro);
        controle.registra(matheus);
        controle.registra(enka);
        System.out.println(controle.getSoma());


    }
}
