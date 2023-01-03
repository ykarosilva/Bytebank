public class gerente extends funcionario implements autenticavel{
    private login autenticador; 
    public gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.autenticador.setSenha(senha);
    }

    public double getBonificacao(){
        return super.getSalario() + getSalario();
    }


    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}

