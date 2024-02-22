package bbubbu.me.dddhexpackage.controller;

import bbubbu.me.dddhexpackage.application.usecase.UserUserCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import user.User;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserUserCase userUserCase;

    @GetMapping("/")
    public String test(){
        return "hello";
    }

    @GetMapping("/{id}")
    public User get(@PathVariable Long id){
        return userUserCase.get(id);
    }
}
