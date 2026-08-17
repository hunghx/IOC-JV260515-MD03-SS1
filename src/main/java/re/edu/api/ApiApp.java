package re.edu.api;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

// Sử dụng @RestController : kết hợp giữa @Controller và @ResponeBody
@RestController // tếp nận và xử lý yêu cầu
public class ApiApp {
    // Tạo 1 phương thức trả về thông tin của sinh vien - con người
    @GetMapping("/info")
    public Person getInfo(){
        String uid = UUID.randomUUID().toString();
        Person p = new Person(uid,"Nguyen Van A", 18);
        return p;
    }

    public Sex getEnum(){
        return Sex.MALE;
    }
    public BigDecimal getDecimal(){
        return BigDecimal.valueOf(100.5);
    }

    public List<Person> getList(){
        return List.of(new Person("1","Nguyen Van A",18),new Person("2","Nguyen Van B",18));
    }
    public Object getNull(){
        return null;
    }
}
