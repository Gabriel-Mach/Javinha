package pratos;


import db.RepositorioPrato;
import exceptions.PJCExcepition;

public class CadastroPrato {
    RepositorioPrato prat;
    public CadastroPrato(RepositorioPrato pratos) {
        this.prat = pratos;
    }

    public void cadastrar(Prato pratos) throws PJCExcepition{
        if(prat.buscar(pratos.getNomePrato())){
            throw new PJCExcepition();

        }else{
            prat.cadastrar(pratos);
        }
    }



}
