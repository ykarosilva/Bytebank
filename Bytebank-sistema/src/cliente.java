public class cliente implements autenticavel {
    private login autenticador; 

public cliente(){
    this.autenticador = new login();
}
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
        
    }

}
