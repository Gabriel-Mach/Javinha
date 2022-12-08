package pratos;


import db.RepositorioPrato;

public class CadastroPrato {
    RepositorioPrato prat;
    public CadastroPrato(RepositorioPrato pratos) {
        this.prat = pratos;
    }

    public void cadastrar(Prato pratos){
        if(prat.existe(pratos.getNomePrato())){

        }else{
            prat.cadastrar(pratos);
        }
    }



}
