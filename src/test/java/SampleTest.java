import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class SampleTest {

    @Test
    public void sampleTest() {
        assertThat(true, is(true));
    }
}
