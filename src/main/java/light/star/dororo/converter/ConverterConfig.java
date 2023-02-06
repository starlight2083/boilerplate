package light.star.dororo.converter;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConverterConfig {

    @Bean
    public BeanPostProcessor beanPostProcessor() {
        return new DororoPostBeanProcessor();
    }
}
