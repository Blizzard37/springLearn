import com.wzs.config.WzsConfig;
import com.wzs.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AllTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(WzsConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser);
    }
}
