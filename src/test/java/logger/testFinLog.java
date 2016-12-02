package logger;

import com.gr.jiang.project.logger.FinBoLog;
import com.gr.jiang.project.logger.FinDBLog;
import com.gr.jiang.project.logger.FinDebugLog;
import com.gr.jiang.project.logger.FinITFLog;
import org.junit.Test;

/**
 * Created by jiang on 2016/11/4.
 */
public class testFinLog {
    @Test
    public void testLog(){
        FinBoLog.info("FinBoLog");
        FinDBLog.info("FinDBLog");
        FinITFLog.info("FinITFLog");
        FinDebugLog.info("FinDebugLog");
    }
}
