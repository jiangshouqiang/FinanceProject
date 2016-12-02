package dao;

import com.gr.jiang.project.dao.TxIfDao;
import com.gr.jiang.project.dao.impl.TxIfDaoImpl;
import com.gr.jiang.project.logger.FinDebugLog;
import com.gr.jiang.project.logger.FinITFLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jiang on 2016/11/1.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"/dispatcher-servlet.xml","/applicationContext.xml"})
//@Transactional
public class TxIfDaoTest {
    @Test
    public void testQuery(){
        FinDebugLog.info("info...");
        FinDebugLog.debug("debug...");
        FinITFLog.info("FinITFLog");
    }
}
