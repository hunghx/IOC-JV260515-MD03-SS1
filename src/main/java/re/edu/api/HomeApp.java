package re.edu.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Để tiếp nhận 1 request thì class này phải được đánh dấu bởi chú thích @Controller
//@RestController
@Controller
public class HomeApp {

    // điều hướng request của người dùng và trả về trang index.html

    // tiếp nhân và x lí yêu cầu với url là /home
    @GetMapping("/home")
    public String home(){ // String là đại diện cho đường dẫn trỏ tới giao diện cần hiển thị
        return "index";
    }
}
