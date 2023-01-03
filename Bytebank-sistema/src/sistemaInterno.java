public class sistemaInterno {
    private int senha = 2222;

    public boolean autentica(autenticavel fa){
        boolean autenticou = fa.autentica(this.senha);
        if (autenticou){
            System.out.println("Sistema Liberado");
            return true;
        } else{
            System.out.println("Senha incorreta");
        return false;
        }
    }
}
