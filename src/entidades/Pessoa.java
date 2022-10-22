package entidades;

public class Pessoa implements entidades.interfaces.Pessoa {

    private String cpf;
    private String nome;
    private char tipo;

    public Pessoa (){}

    public Pessoa(String cpf, String nome, int numCadeira){
        this.cpf = cpf;
        this.nome = nome;
        this.tipo = getTipo(numCadeira);
    }


    @Override
    public String getCPF() {
        return this.cpf;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public char getTipo(int numCadeira) {
        if(numCadeira <= 20){
            return 'F';
        }else{
            return 'N';
        }
    }
}
