package light.star.dororo.converter;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class BaseConverterTest {

    @Test
    public void test() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        Plan plan = new Plan();
        plan.setName("test");

        ConverterContext.add(Plan.class, new PlanConverter());
        PlanModel model = ConverterContext.get(Plan.class).convert(plan, PlanModel.class);

        System.out.println(model.toString());
    }
}