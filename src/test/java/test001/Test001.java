package test001;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import main001.Main001;

public class Test001 {

    @Test
    public void testGetColor1() {
        Main001 c1 = new Main001();
        String t1 = c1.getColor(1);
        assertThat(t1,is("赤"));
    }
    @Test
    public void testGetColor2() {
    	Main001 c1 = new Main001();
        String t1 = c1.getColor(2);
        assertThat(t1,is("青"));
    }
    @Test
    public void testGetColor3() {
    	Main001 c1 = new Main001();
        String t1 = c1.getColor(3);
        assertThat(t1,is("1or2を入力して下さい"));
    }
}