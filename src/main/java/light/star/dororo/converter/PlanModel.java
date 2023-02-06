package light.star.dororo.converter;

import light.star.dororo.common.base.BaseModel;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
public class PlanModel extends BaseModel {

    private String name;
}
