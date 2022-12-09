package db;

import pratos.Prato;

public class RespositorioPratoVetor implements RepositorioPrato{
    Prato[] insumos ;

    public RespositorioPratoVetor(int t) {
        this.insumos = new Prato[t];
    }

    public void carda() {
        System.out.println("Prato      Valor");
        for (int i = 0; i <insumos.length; i++){
            System.out.println(insumos[i].getNomePrato()+"    R$:"+insumos[i].getPreco());
        }

    }

    @Override
    public void cadastrar(Prato pratos) {
        for (int i = 0; i < insumos.length; i++){
            if(insumos[i]== null){
                insumos[i] = pratos;
                break;
            }
        }
    }



    @Override
    public void atualizar(String nomePrato, Prato pratos) {

    }

    @Override
    public boolean existe(String nomePrato) {
        return false;
    }

    @Override
    public boolean buscar(String nomePrato) {
        boolean result = false;
        for (int i = 0; i <insumos.length; i++){
            if(insumos[i]!=null && insumos[i].getNomePrato().equals(nomePrato)){
                result = true;
            }
        }
        return result;
    }
}
