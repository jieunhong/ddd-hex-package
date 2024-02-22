package bbubbu.me.dddhexpackage.application.out.adapter;

import org.springframework.stereotype.Component;
import user.User;

@Component
public class UserMapper {

    public User toDomain(UserEntity entity) {
        return User.of(entity.getId(), entity.getName(), entity.getHeight(), entity.getWeight());
    }

    public UserEntity toEntity(User domain) {
        return UserEntity.of(domain.getId(), domain.getName(), domain.getBodyInfo().getHeight(), domain.getBodyInfo()
                                                                                                       .getWeight());
    }
}
