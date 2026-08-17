package re.edu.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor // hàm tạo ko tham số
@AllArgsConstructor
@Getter
@Setter
public class Person {
    private String id;
    private String name;
    private int age;
}
