package main.java.ru.asteises.patterns.propertyContainer;

import java.util.HashMap;

public class PropertyContainerImpl implements PropertyContainer {

    private final HashMap<String, Object> innerProp;

    public PropertyContainerImpl() {
        innerProp = new HashMap<>();
    }

    public void setProp(String name, Object value) {

        if (name == null || value == null) {
            return;
        }

        if (innerProp.containsKey(name)) {
            innerProp.replace(name, value);
        } else {
            innerProp.put(name, value);
        }
    }

    public Object getProp(String name) {
        if (name == null || !innerProp.containsKey(name)) {
            return new RuntimeException("Object not found");
        } else {
            return innerProp.get(name);
        }
    }

    public HashMap<String, Object> getInnerProp() {
        return innerProp;
    }

    public void removeProp(String name) {
        if (name == null || !innerProp.containsKey(name)) {
            throw new RuntimeException("Object not found");
        } else {
            innerProp.remove(name);
        }
    }

    public void removeAllProps() {
        innerProp.clear();
    }

}
