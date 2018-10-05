package xyz.tumit.bigbears;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BigbearsApplicationTests {

    @Test
    public void hello() {
        BigbearsApplication app = new BigbearsApplication();
        assertThat(app.hello("World")).isEqualTo("Hello, World!");
    }

}
