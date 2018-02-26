package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demo03 {
	//1、 基于类的名称获取日志对象
	static Logger logger = Logger.getLogger(Demo03.class);
	
	public static void main(String[] args) {
		//与 Log4j入门 中的BasicConfigurator.configure();方式不同，采用指定配置文件
		//Log4j的配置方式按照log4j.properties中的设置进行
		PropertyConfigurator.configure("D:\\project\\JavaApplication\\src\\log4j.properties");
		for (int i = 0; i < 10; i++) {
			logger.trace("跟踪信息");
			logger.debug("调试信息");
			logger.info("输出信息");
			logger.warn("警告信息");
			logger.error("错误信息");
			logger.fatal("致命信息");
		}
		
	}
	
/*	log4j日志输出格式一览：
	%c 输出日志信息所属的类的全名
	%d 输出日志时间点的日期或时间，默认格式为ISO8601，也可以在其后指定格式，比如：%d{yyy-MM-dd HH:mm:ss }，输出类似：2002-10-18- 22：10：28
	%f 输出日志信息所属的类的类名
	%l 输出日志事件的发生位置，即输出日志信息的语句处于它所在的类的第几行
	%m 输出代码中指定的信息，如log(message)中的message
	%n 输出一个回车换行符，Windows平台为“rn”，Unix平台为“n”
	%p 输出优先级，即DEBUG，INFO，WARN，ERROR，FATAL。如果是调用debug()输出的，则为DEBUG，依此类推
	%r 输出自应用启动到输出该日志信息所耗费的毫秒数
	%t 输出产生该日志事件的线程名

	所以：
	%5p [%t] (%F:%L) - %m%n 就表示
	宽度是5的优先等级 线程名称 (文件名:行号) - 信息 回车换行*/
}
