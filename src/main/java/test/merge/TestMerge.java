package test.merge;

import com.lsy.www.mapper.UserEntityMapper;
import com.lsy.www.po.UserEntity;
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

import java.util.List;

/**
 * Created by lsy on 2017/5/26.
 */
@RunWith(EasyMockRunner.class)
public class TestMerge extends EasyMockSupport {
//    @Mock
//    private UserEntityMapper userEntityMapper = Mockito.mock(UserEntityMapper.class);
//    @TestSubject
    private UserService userService/* = new UserServiceImpl()*/;

    ClassPathXmlApplicationContext ctx;
    @Before
    public void loadCtx() {
        ctx = new ClassPathXmlApplicationContext("classpath:spring/spring.xml");
        userService = (UserService)ctx.getBean("userService");
    }

    @Test
    public void insertUsertest(){
        UserEntity userEntity = new UserEntity("santugege","123456");
        userService.insertUser(userEntity);
    }
    @Test
    public void deleteUserByIdTest(){
        userService.deleteUserById(10L);
    }
    @Test
    public void updateUserByIdTest(){
        UserEntity userEntity = new UserEntity(12L);
        userEntity.setUserName("santuge");
        userEntity.setTrueName("lsy3");
        userService.updateUserById(userEntity);
    }
    @Test
    public void getUserByIdTest(){
        UserEntity userById = userService.getUserById(11L);
        System.out.println(userById);
    }
    @Test
    public void getUsersByConditionsTest(){
        UserEntity userEntity = new UserEntity("1234567890","1234567890");
        List<UserEntity> usersByConditions = userService.getUsersByConditions(userEntity);
        for (UserEntity user : usersByConditions) {
            System.out.println(user);
        }
    }
    @Test
    public void getAllUsersTest(){
        List<UserEntity> users = userService.getAllUsers();
        for (UserEntity user : users) {
            System.out.println(user);
        }
    }
}
