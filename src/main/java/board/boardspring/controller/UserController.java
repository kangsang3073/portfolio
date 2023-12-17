package board.boardspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 웹 애플리케이션의 컨트롤러임을 나타내는 어노테이션
@Controller
public class UserController {
    // index.html의 method를 get타입으로 받아서 /loginForm 매핑해준다.
    @GetMapping("/loginForm")
    public String loginForm(){
        // url 주소가 맞으면 /user/loginForm.html를 띄어 준다.
        return "/user/loginForm";
    }
}
