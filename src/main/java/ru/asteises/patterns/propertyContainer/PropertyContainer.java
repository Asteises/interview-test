package main.java.ru.asteises.patterns.propertyContainer;

import java.util.HashMap;

public interface PropertyContainer {

    void setProp(String name, Object value);

    Object getProp(String name);

    HashMap<String, Object> getInnerProp();

    void removeProp(String name);

    void removeAllProps();
}
