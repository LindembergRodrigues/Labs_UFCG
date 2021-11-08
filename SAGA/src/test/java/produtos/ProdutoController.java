package produtos;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProdutoController {

    Map<String, Produto> mapa;

    public ProdutoController(){
        mapa = new LinkedHashMap<String, Produto>();
    }

    public String inserirProduto(String nome, Produto produto){
        String chave = produto.getNome() + " " + produto.getDescricao();
        if (!mapa.containsKey(chave)){
            mapa.put(chave,produto);
        }else if (mapa.containsKey(chave)){
            throw new RuntimeException("Produto Já cadastrado!");
        }
        return  null;
    }

    public String representacaoTextual(String nomeEDescricao){
        return mapa.get(nomeEDescricao).toString();
    }

    public String representacaoTextualDeTodosOsClientes(){
        String retornoTotal = "";
        for (String i: mapa.keySet()){
            retornoTotal += mapa.get(i).toString() + " | ";
        }
        if (retornoTotal != "") {
            return retornoTotal.substring(0, retornoTotal.length()-1);
        }else{
            return  retornoTotal;
        }
    }

    public boolean validaId(String nomeEDescricao){
        return  mapa.containsKey(nomeEDescricao);
    }

    public void alteraCliente(String nomeEDescricao, Produto produto){
        mapa.put(nomeEDescricao,produto);
    }

    public void removeCliente(String nomeEDescricao){
        mapa.remove(nomeEDescricao);
    }
}
