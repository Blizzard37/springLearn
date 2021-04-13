import com.wzs.pojo.Hello;
import com.wzs.service.YysServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        YysServiceImpl yysServiceImpl = (YysServiceImpl) context.getBean("yysServiceImpl");
        yysServiceImpl.logIn();
    }
}
