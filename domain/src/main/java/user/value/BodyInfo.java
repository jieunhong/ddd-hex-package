package user.value;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class BodyInfo {
    private Float height;
    private Float weight;

    public static BodyInfo of(Float height, Float weight) {
        return new BodyInfo(height, weight);
    }
}
