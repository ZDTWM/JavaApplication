package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demo04 {
	//1�� ����������ƻ�ȡ��־����
	static Logger logger = Logger.getLogger(Demo04.class);
	
	public static void main(String[] args) {
		//2��ʹ��log4j.xml��Ϊ�����ļ���������
		PropertyConfigurator.configure("D:\\project\\JavaApplication\\src\\log4j.xml");
		for (int i = 0; i < 10; i++) {
			//3.���в�ͬ�������־���
            logger.trace("������Ϣ");
            logger.debug("������Ϣ");
            logger.info("�����Ϣ");
            logger.warn("������Ϣ");
            logger.error("������Ϣ");
            logger.fatal("������Ϣ");
		}
		
	}
	
}
