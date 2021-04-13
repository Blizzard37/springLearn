import com.wzs.pojo.Student;
import com.wzs.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AllTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }
    @Test
    public void TestCAndP(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("userBean.xml");
        User user = applicationContext.getBean("user", User.class);
        User czy = applicationContext.getBean("czy", User.class);
        System.out.println(user);
        System.out.println(czy);
    }
}
