package ch.meyenberger.webapps.dockertest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DockertestApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void works()  {
    }

    @Test
    public void fails() throws Exception {
        throw new Exception();
    }
}
