package db;

import pratos.Prato;

public class RespositorioPratoVetor implements RepositorioPrato{
    Prato[] insumos ;

    public RespositorioPratoVetor(int t) {
        this.insumos = new Prato[t];
    }
    public void card(){
        System.out.println("Prato      Valor");
        for (int i = 0; i <insumos.length; i++){
            System.out.println(insumos[i].getNomePrato()+"    R$:"+insumos[i].getPreco());
        }

    }

    @Override
    public void cadastrar(Prato pratos) {
        if (this.insumos[0] == null){
                this.insumos[0] = pratos;

        }else {
                for (int i = 0; i <insumos.length;i++){
                    if (this.insumos[i] == null){
                        this.insumos[i] = pratos;
                        break;

                    }
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
    public Prato buscar(String nomePrato) {
        return null;
    }
}
