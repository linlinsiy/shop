package merge;

import com.lsy.www.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lsy on 2017/5/26.
 */
public class TestMerge {
    private UserService userService;

    ClassPathXmlApplicationContext ctx;
    @Before
    public void loadCtx() {
        ctx = new ClassPathXmlApplicationContext("classpath:spring/spring.xml");
        userService = (UserService)ctx.getBean("userService");
    }

    @Test
    public void test(){

    }
}
