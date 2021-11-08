package mae;
import java.util.LinkedHashMap;
import java.util.Map;

public class Controller {

    Map<String, Object> mapa;

    Controller(){
        mapa = new LinkedHashMap<String, Object>();
    }

    public String inserir(String id, Object parametro){
        if (!mapa.containsKey(id)){
            mapa.put(id,parametro);
            return id;
        }else if (mapa.containsKey(id)){
            throw new RuntimeException("Já cadastrado!");
        }
        return  null;
    }

    public String representacaoTextual(String id){
        return mapa.get(id).toString();
    }

    public String representacaoTextualDeTodosOsClientes(String id){
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

    public boolean validaId(String id){
        return  mapa.containsKey(id);
    }

    public void alteraCliente(String id, Object parametro){
        mapa.put(id,parametro);
    }

    public void removeCliente(String id){
        mapa.remove(id);
    }
}