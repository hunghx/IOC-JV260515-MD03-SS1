package re.edu.api;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Để tiếp nhận 1 request thì class này phải được đánh dấu bởi chú thích @Controller
//@RestController
@Controller
@RequiredArgsConstructor
public class HomeApp {
    // Có 3 cách thực hện DI vào 1 class cụ thể
    // C1: Field Injection = @Autowired

    private final Caculate caculate; // nullPoiterexxception

    // C2: Setter Injection
//    @Autowired
//    public void setCaculate(Caculate caculate){
//        this.caculate = caculate;
//    }

    // C3: Constructor Injection(ưu tiên)
//    public HomeApp(Caculate caculate){
//        this.caculate =caculate;
//    }

    // điều hướng request của người dùng và trả về trang index.html

    // tiếp nhân và xử lí yêu cầu với url là /home
    @GetMapping("/home")
    public String home(){ // String là đại diện cho đường dẫn trỏ tới giao diện cần hiển thị
        System.out.println("test sum method : "+caculate.sum(1,2));
        return "index";
    }

    @GetMapping("/sum")
    public String sum(){
        return "sum";
    }


    // Spring IOC - Nguyên lý thiết kế
    // DI
}
