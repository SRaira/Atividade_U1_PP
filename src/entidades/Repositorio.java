package entidades;

import entidades.interfaces.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Repositorio implements entidades.interfaces.Repositorio {

    private List <Pessoa> lista;
    private int posicao = 0;
    public Repositorio(){
        this.lista = new ArrayList<>();
    }



    @Override
    public void guarda(Pessoa pessoa) {
        lista.add(pessoa);
    }

    @Override
    public Pessoa recupera(String cpf) {
        for (Pessoa p : lista){
            if(cpf.equals(p.getCPF())){
                return p;
            }
        }
        return null;
    }

    @Override
    public Pessoa primeiro() {
        return lista.get(0);
    }

    @Override
    public Pessoa proximo() {
        this.posicao++;
        return lista.get(posicao);
    }

    public List<Pessoa> getLista(){
        return lista;
    }

}
