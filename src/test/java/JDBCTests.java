import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.springframework.test.util.AssertionErrors.fail;

@Log4j
public class JDBCTests {
    final String url = "jdbc:mysql://localhost:1521/db";
    final String user = "user";
    final String password = "password";

    static {
        try {
            // oracle
//            Class.forName("oracle.jdbc.driver.OracleDriver");
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection() {
        // mysql.sh에서 Docker로 생성한 url / user / password
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            log.info(con);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
