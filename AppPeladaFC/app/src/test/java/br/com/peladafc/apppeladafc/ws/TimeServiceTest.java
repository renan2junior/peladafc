package br.com.peladafc.apppeladafc.ws;

import org.junit.Before;
import org.junit.Test;

import br.com.peladafc.apppeladafc.model.Time;

/**
 * Created by renanjunior on 7/22/16.
 */
public class TimeServiceTest {

    TimeService s;

    @Before
    public void initObjects(){
        s = new TimeService();
    }

    @Test
    public void testListaTimes() throws Exception {
        s.listaTimes();
    }

    @Test
    public void testCreateTime() throws Exception{
        Time t = new Time();
        t.setNome("Bostafogo2");
        s.createTime(t);
    }

    @Test
    public void testDeleteTime() throws Exception{
        s.deleteTime("5");
    }

    @Test
    public void testListaNovamenteTimes() throws Exception {
        s.listaTimes();
    }

    @Test
    public void testUpdateTime() throws Exception{
        Time time = s.getTimeByID("12");
        time.setNome("Palmeiras");
        s.updateTime(time);
    }

}
