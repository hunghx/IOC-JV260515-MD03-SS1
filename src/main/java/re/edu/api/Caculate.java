package re.edu.api;

import org.springframework.stereotype.Component;

@Component // đánh dấu đây là 1 đối tượng đc tao và quản lí bởi spring - gọi là Bean

// Có 2 cách để đánh dấu 1 đối tượng được quản lý bởi spring
// Cách 1 ử dụng bộ annotation : Component, Controller/ RestController, Service, Repository
// Cách 2: khai báo thủ công với @Bean
public class Caculate {
    public int sum(int a, int b){
        return a+b;
    }
}
