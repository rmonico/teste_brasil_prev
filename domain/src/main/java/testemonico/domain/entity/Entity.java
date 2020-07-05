package testemonico.domain.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder(toBuilder = true, builderMethodName = "")
public abstract class Entity<I> {

    private I id;
}
