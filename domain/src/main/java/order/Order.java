package order;

import java.time.LocalDate;
import lombok.Getter;
import user.value.BodyInfo;

@Getter
public class Order {

    private Long id;

    private LocalDate orderDate;

    private Long userId;
}
