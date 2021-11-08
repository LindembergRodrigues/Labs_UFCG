package cliente;

import java.util.LinkedHashMap;
import java.util.Map;

public class ClienteController {
    Map<String,Cliente> mapaCliente;

    public ClienteController(){
        mapaCliente = new LinkedHashMap<>();
    }

    public String inserirCliente(String CPF, Cliente cliente){
        if (!mapaCliente.containsKey(CPF)){
            mapaCliente.put(CPF,cliente);
            return CPF;
        }else if (mapaCliente.containsKey(CPF)){
            throw new RuntimeException("Clinte já cadastrado!");
        }
        return  null;
    }

    public String representacaoTextual(String CPF){
        return mapaCliente.get(CPF).toString();
    }

    public String representacaoTextualDeTodosOsClientes(){
        String retornoTotal = "";
        for (String i: mapaCliente.keySet()){
            retornoTotal += mapaCliente.get(i).toString() + " | ";
        }
        if (!retornoTotal.equals("")) {
            return retornoTotal.substring(0, retornoTotal.length()-2);
        }else{
            return  retornoTotal;
        }
    }

    public boolean validaCPF(String CPF){
        return  mapaCliente.containsKey(CPF);
    }

    public void alteraCliente(String CPF, Cliente cliente){
        mapaCliente.put(CPF,cliente);
    }

    public void removeCliente(String CPF){
        mapaCliente.remove(CPF);
    }
}
