public class administrador extends funcionario implements autenticavel{

    private login autenticador; 

    public administrador(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.autenticador.setSenha(senha);
    }
    
    @Override
    public double getBonificacao(){
        return 50;
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}

