package light.star.dororo.converter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public interface BaseConverter {

    default <T> T convert(Object obj, Class<T> type) throws InvocationTargetException, IllegalAccessException {
        Method[] declaredMethods = this.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (Modifier.isProtected(method.getModifiers()) && method.getReturnType().equals(type)) {
               return type.cast(method.invoke(this, obj));
            }
        }

        return null;
    }
}
