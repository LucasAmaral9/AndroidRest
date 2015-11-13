package util;


import java.util.TreeSet;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import to.Carro;

public class JSonFacade {
	
public static String listToJSon(TreeSet<Carro> lista) {
JSONArray vetor = new JSONArray();
for (Carro carro : lista)
{
JSONObject object = new JSONObject();
try {
object.put("marca", carro.getMarca());
object.put("fabricante",carro.getFabricante());
object.put("preco", carro.getPreco());
object.put("precoCon", carro.getPrecoCon());
object.put("imagem", carro.getImagem());
object.put("estado", carro.getEstado());


vetor.put(object);
} catch (JSONException e) {
e.printStackTrace();
}
}
return vetor.toString();
}

public static String listToJSon2(Carro carro) {
JSONArray vetor = new JSONArray();

JSONObject object = new JSONObject();
try {
object.put("marca", carro.getMarca());
object.put("fabricante",carro.getFabricante());
object.put("preco", carro.getPreco());
object.put("precoCon", carro.getPrecoCon());
object.put("imagem", carro.getImagem());
object.put("estado", carro.getEstado());


vetor.put(object);
} catch (JSONException e) {
e.printStackTrace();
}

return vetor.toString();
}
}