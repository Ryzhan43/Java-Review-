import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.Consumer;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Course implements Consumer {
    private String courseName;
    private Integer courseId;

    @Override
    public void accept(Object o) {

        System.out.println((int)o+1);
    }
}
