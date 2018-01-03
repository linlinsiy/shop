package test.merge;

import com.lsy.www.mapper.UserEntityMapper;
import com.lsy.www.service.UserService;
import com.lsy.www.service.impl.UserServiceImpl;
import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lsy on 2017/5/26.
 */
@RunWith(EasyMockRunner.class)
public class TestMerge extends EasyMockSupport {
    @Mock
    private UserEntityMapper userEntityMapper = Mockito.mock(UserEntityMapper.class);
    @TestSubject
    private UserService userService = new UserServiceImpl();

//    ClassPathXmlApplicationContext ctx;
//    @Before
//    public void loadCtx() {
//        ctx = new ClassPathXmlApplicationContext("classpath:spring/spring.xml");
//        userService = (UserService)ctx.getBean("userService");
//    }

    @Test
    public void test(){

    }
}
