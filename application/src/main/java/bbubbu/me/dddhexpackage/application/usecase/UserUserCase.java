package bbubbu.me.dddhexpackage.application.usecase;

import bbubbu.me.dddhexpackage.application.out.port.UserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import user.User;

@Service
@RequiredArgsConstructor
public class UserUserCase {

    private final UserPort userPort;

    public User get(Long id) {
        return userPort.get(id);
    }
}
