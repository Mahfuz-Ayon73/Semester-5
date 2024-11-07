package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<String, Prototype> prototypes = new HashMap<>();

    public void registerProduct(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }

    public Prototype getProduct(String key) {
        Prototype prototype = prototypes.get(key);
        return (prototype != null) ? prototype.clone() : null;
    }
}
