package user;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import user.value.BodyInfo;


@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User {

    private Long id;

    private String name;

    private BodyInfo bodyInfo;

    public static User of(Long id, String name, Float height, Float weight){
        return new User(id, name, BodyInfo.of(height, weight));
    }
}
