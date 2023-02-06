package light.star.dororo.converter;

@ConvertSupport(support = Plan.class)
public class PlanConverter implements BaseConverter {

    protected PlanModel convert(Plan user) {
        return PlanModel.builder().id(user.getId()).name(user.getName()).build();
    }
}
