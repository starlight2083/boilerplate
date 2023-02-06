package light.star.dororo.converter;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.Objects;

public class DororoPostBeanProcessor implements BeanPostProcessor {

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        ConvertSupport convertSupport = bean.getClass().getAnnotation(ConvertSupport.class);
        if (Objects.nonNull(convertSupport)) {
            return ConverterContext.add(convertSupport.support(), BaseConverter.class.cast(bean));
        }
        
        return bean;
    }
}
