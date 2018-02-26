package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demo04 {
	//1、 基于类的名称获取日志对象
	static Logger logger = Logger.getLogger(Demo04.class);
	
	public static void main(String[] args) {
		//2、使用log4j.xml作为配置文件，并运行
		PropertyConfigurator.configure("D:\\project\\JavaApplication\\src\\log4j.xml");
		for (int i = 0; i < 10; i++) {
			//3.进行不同级别的日志输出
            logger.trace("跟踪信息");
            logger.debug("调试信息");
            logger.info("输出信息");
            logger.warn("警告信息");
            logger.error("错误信息");
            logger.fatal("致命信息");
		}
		
	}
	
}
