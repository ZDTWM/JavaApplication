package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Log4j����
 * 	ʹ��Log4j
 * @author Administrator
 *
 */
	//Ϊ��Ӧ���������������ʹ��Log4j��������־����� �������´��룬ִ����ͬ������� ���Կ����������м����Ĺۣ�
	//1. ֪����log4j.TestLog4j����������־
	//2. ����[main]�߳������־
	//3. ��־����ɹ۲죬һ����6������ TRACE DEBUG INFO WARN ERROR FATAL
	//4. ��־�������Χ�ɿ��ƣ� �������ʾ��ֻ�������DEBUG����ģ���ôTRACE�������־�Զ������
	//5. ÿ����־���ĵĺ�����(��ǰ�������)���ɹ۲죬�����Ϳ��Խ������ܼ���
public class Demo02 {
	//1�� ����������ƻ�ȡ��־����
	static Logger logger  = Logger.getLogger(Demo02.class);
	public static void main(String[] args) throws InterruptedException {
		//2. ����Ĭ������
		BasicConfigurator.configure();
		//3. ������־�������
		logger.setLevel(Level.DEBUG);
		//4.���в�ͬ�������־���
		logger.trace("������Ϣ");
		logger.debug("������Ϣ");
		logger.info("�����Ϣ");
		Thread.sleep(1000);//��Ϊ�˱��ڹ۲�ǰ����־�����ʱ���
		logger.warn("������Ϣ");
		logger.error("������Ϣ");
		logger.fatal("������Ϣ");
		
	}
}
