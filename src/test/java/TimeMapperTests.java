import com.spring.RootConfig;
import com.spring.mapper.TimeMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// xml = RootConfig
// xml 을 사용할 경우
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// RootConfig를 사용할 경우
@ContextConfiguration(classes = RootConfig.class)
@Log4j
public class TimeMapperTests {

    @Setter(onMethod_ = @Autowired)
    private TimeMapper timeMapper;

    @Test
    public void testGetTime() {
        log.info(timeMapper.getClass().getName());
        log.info(timeMapper.getTime());
        log.info("getTime2");
        log.info(timeMapper.getTime2());
    }
}
