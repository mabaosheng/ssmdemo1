package user;

import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.user.service.UserServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by 马保生 on 2017/6/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestUser {
    @Inject
    private UserServices userServices;

    @Test
    public void testLogin() {

        System.out.println(userServices.login(new Tbuser("admin","1234")));

    }
}
