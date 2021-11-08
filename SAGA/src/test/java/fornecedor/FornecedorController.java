package fornecedor;

import java.util.LinkedHashMap;
import java.util.Map;

public class FornecedorController {

    Map<String, Fornecedor> mapaFornecedor;

    public FornecedorController(){
        mapaFornecedor = new LinkedHashMap<String, Fornecedor>();
    }

    public String inserirCliente(String nome, Fornecedor fornecedor){
        if (!mapaFornecedor.containsKey(nome)){
            mapaFornecedor.put(nome,fornecedor);
            return nome;
        }else if (mapaFornecedor.containsKey(nome)){
            throw new RuntimeException("fornecedor já cadastrado!");
        }
        return  null;
    }

    public String representacaoTextual(String nome){
        return mapaFornecedor.get(nome).toString();
    }

    public String representacaoTextualDeTodosOsClientes(String CPF){
        String retornoTotal = "";
        for (String i: mapaFornecedor.keySet()){
            retornoTotal += mapaFornecedor.get(i).toString() + " | ";
        }
        if (retornoTotal != "") {
            return retornoTotal.substring(0, retornoTotal.length()-1);
        }else{
            return  retornoTotal;
        }
    }

    public boolean validaNome(String nome){
        return  mapaFornecedor.containsKey(nome);
    }

    public void alteraCliente(String nome, String email, String telefone){
        mapaFornecedor.get(nome).setEmail(email);
        mapaFornecedor.get(nome).setEmail(telefone);
    }

    public void removeCliente(String CPF){
        mapaFornecedor.remove(CPF);
    }
}
