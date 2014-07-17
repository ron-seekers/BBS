
import com.ourselves.forum.entity.UserInfo;
import com.ourselves.forum.service.UserInfoService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Ron
 * Date: 14-6-12
 * Time: 下午3:00
 */
public class UserTest {
      @Autowired
      private UserInfoService userService;

      @Before
      public void before() {
            @SuppressWarnings("resource")
            ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:Config/spring.xml"
                      , "classpath:Config/spring-mybatis.xml"});
            userService = (UserInfoService) context.getBean("userInfoServiceImpl");
      }

      @Test
      public void addUser() {
            UserInfo user = new UserInfo();
          user.setId(6);
            user.setUsername("张三");
            user.setPassword("111111");
            user.setEmail("aaaa@163.com");
            user.setSex(1);
            user.setTel("11111111111");
            user.setNickname("1111");
          user.setQQ("1111");
          user.setProvince("1");
          user.setCity("11");
            System.out.println(userService.update(user));
      }
}

