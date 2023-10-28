package Imposto;

import java.util.HashMap;
import java.util.Map;

public class ImpostoFactory {
    Map<String, IImposto> impostos = new HashMap<String, IImposto>();

	public ImpostoFactory(){
		impostos.put("IPTU", new Iptu());
		impostos.put("IPI", new Ipi());	
	}
	
	public IImposto getImposto(String nomeImposto){
	   return impostos.get(nomeImposto);
	}
}
