package light.star.dororo.converter;

import light.star.dororo.common.base.BaseEntity;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Setter
public class Plan extends BaseEntity {

    private String name;
}
