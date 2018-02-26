package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Log4j入门
 * 	使用Log4j
 * @author Administrator
 *
 */
	//为了应对这种情况，我们使用Log4j来进行日志输出。 采用如下代码，执行雷同的输出。 可以看到输出结果有几个改观：
	//1. 知道是log4j.TestLog4j这个类里的日志
	//2. 是在[main]线程里的日志
	//3. 日志级别可观察，一共有6个级别 TRACE DEBUG INFO WARN ERROR FATAL
	//4. 日志输出级别范围可控制， 如代码所示，只输出高于DEBUG级别的，那么TRACE级别的日志自动不输出
	//5. 每句日志消耗的毫秒数(最前面的数字)，可观察，这样就可以进行性能计算
public class Demo02 {
	//1、 基于类的名称获取日志对象
	static Logger logger  = Logger.getLogger(Demo02.class);
	public static void main(String[] args) throws InterruptedException {
		//2. 进行默认配置
		BasicConfigurator.configure();
		//3. 设置日志输出级别
		logger.setLevel(Level.DEBUG);
		//4.进行不同级别的日志输出
		logger.trace("跟踪信息");
		logger.debug("调试信息");
		logger.info("输出信息");
		Thread.sleep(1000);//是为了便于观察前后日志输出的时间差
		logger.warn("警告信息");
		logger.error("错误信息");
		logger.fatal("致命信息");
		
	}
}
