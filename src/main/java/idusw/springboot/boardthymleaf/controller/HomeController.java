package idusw.springboot.boardthymleaf.controller;

import idusw.springboot.boardthymleaf.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class HomeController {
    @Autowired
    MemoService memoService;  // MemoService 인터페이스의 구현체를 필드 주입

    @GetMapping("/")
    public String goHome()  {
        return "/admin/index";
    }

    @GetMapping("/buttons")
    public String getbuttons() {
        return "buttons";
    }

    @GetMapping("/cards")
    public String getcards() {
        return "cards";
    }


}
