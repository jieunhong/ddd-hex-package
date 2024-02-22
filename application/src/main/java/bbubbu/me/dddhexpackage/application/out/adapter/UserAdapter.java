package bbubbu.me.dddhexpackage.application.out.adapter;

import bbubbu.me.dddhexpackage.application.out.port.UserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import user.User;

@Repository
@RequiredArgsConstructor
public class UserAdapter implements UserPort {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @Override
    public User get(Long id) {
        UserEntity user = userRepository.findById(id)
                                        .orElseThrow();
        return userMapper.toDomain(user);
    }
}
