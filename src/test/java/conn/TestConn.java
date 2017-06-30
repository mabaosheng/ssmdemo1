package conn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by 马保生 on 2017/6/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestConn {
    @Inject
    private DataSource dataSource;

    @Test
    public void testConn() {
        try {
            Connection conn = dataSource.getConnection();
            if(conn!=null){
                System.out.println("success");
            }else{
                System.out.println("failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
