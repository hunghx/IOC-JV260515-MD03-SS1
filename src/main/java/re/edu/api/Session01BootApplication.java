package re.edu.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Session01BootApplication {


    public static void main(String[] args) {

        // làm sao để gọi 1 phương thức instances
        // ioc là nguyên lý đảo ngược điều khiển
        // di - tiêm phụ thuộc , ấy các đối tượng đã được tạo và quản lí bởi framework ra để sử dụng
//        caculate.sum(1,2);
        SpringApplication.run(Session01BootApplication.class, args);
    }

//    @Bean
//    // phương thức để taạo ra đối tượng
//    public Caculate caculate(){
//        return new Caculate();
//    }

}
