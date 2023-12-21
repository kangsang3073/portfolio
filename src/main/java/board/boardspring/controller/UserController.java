package board.boardspring.controller;

import board.boardspring.dto.UserDto;
import board.boardspring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

// 웹 애플리케이션의 컨트롤러임을 나타내는 어노테이션
@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // index.html의 method를 get타입으로 받아서 /loginForm 매핑해준다.
    @GetMapping("/loginForm")
    public String loginForm(){
        // url 주소가 맞으면 /user/loginForm.html를 띄어 준다.
        return "/user/loginForm";
    }

    @GetMapping("/joinForm")
    public String joinForm(){
        return "/user/joinForm";
    }

    @PostMapping("/join")
    public String join(@ModelAttribute UserDto userDto){
        userService.save(userDto);
        return "redirect:/";
    }
}
