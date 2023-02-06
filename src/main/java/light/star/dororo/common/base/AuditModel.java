package light.star.dororo.common.base;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class AuditModel extends BaseModel {

    private LocalDate createdAt;

    private LocalDate updatedAt;

    protected AuditModel(BaseModelBuilder<?, ?> b) {
        super(b);
    }
}
