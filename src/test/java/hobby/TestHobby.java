package hobby;

import cn.bdqn.tangcco.entity.Hobby;
import cn.bdqn.tangcco.hobby.services.HobbyServices;
import cn.bdqn.tangcco.tools.PageUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by 马保生 on 2017/7/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestHobby {

    @Inject
    private HobbyServices hobbyServices;

    @Test
    public void testQueryAll() {
        PageUtil<Hobby> hobbyPageUtil = hobbyServices.queryAll(1, 5);
       /* List<Hobby> list = hobbyPageUtil.getObjs();
        for (Hobby h : list) {
            System.out.println(h);
        }*/
        System.out.println(hobbyPageUtil.getTotal());



    }
}
