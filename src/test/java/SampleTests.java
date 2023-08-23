import static org.junit.Assert.assertNotNull;

import com.spring.RootConfig;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.spring.di.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")에
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class SampleTests {
    
    @Setter(onMethod_ = {@Autowired})
    private Restaurant restaurant;
    
    @Test
    public void testExist() {
        assertNotNull(restaurant);

        log.info(restaurant);
        log.info(restaurant.getChef());
    }
    
}
