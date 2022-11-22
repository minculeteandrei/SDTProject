package Lab3.Prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrototypeRegistry {
    private static int id;
    private Map<Integer, Character> charMap;

    public PrototypeRegistry() {
        PrototypeRegistry.id = 0;
        this.charMap = new HashMap<>();
    }

    public void add(Character c) {
        this.charMap.put(++id, c);
    }

    public Set<Integer> getChars() {
        return this.charMap.keySet();
    }

    public String getCharName(int i) {
        return this.charMap.get(i).getName();
    }
}
