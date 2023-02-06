package light.star.dororo.converter;

import java.util.HashMap;
import java.util.Map;

public class ConverterContext {

    private static Map<Class, BaseConverter> converterMap = new HashMap<>();

    public static BaseConverter add(Class type, BaseConverter converter) {
        return converterMap.put(type, converter);
    }

    public static BaseConverter get(Class type) {
        return converterMap.get(type);
    }
}
