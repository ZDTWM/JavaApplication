package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demo03 {
	//1�� ����������ƻ�ȡ��־����
	static Logger logger = Logger.getLogger(Demo03.class);
	
	public static void main(String[] args) {
		//�� Log4j���� �е�BasicConfigurator.configure();��ʽ��ͬ������ָ�������ļ�
		//Log4j�����÷�ʽ����log4j.properties�е����ý���
		PropertyConfigurator.configure("D:\\project\\JavaApplication\\src\\log4j.properties");
		for (int i = 0; i < 10; i++) {
			logger.trace("������Ϣ");
			logger.debug("������Ϣ");
			logger.info("�����Ϣ");
			logger.warn("������Ϣ");
			logger.error("������Ϣ");
			logger.fatal("������Ϣ");
		}
		
	}
	
/*	log4j��־�����ʽһ����
	%c �����־��Ϣ���������ȫ��
	%d �����־ʱ�������ڻ�ʱ�䣬Ĭ�ϸ�ʽΪISO8601��Ҳ���������ָ����ʽ�����磺%d{yyy-MM-dd HH:mm:ss }��������ƣ�2002-10-18- 22��10��28
	%f �����־��Ϣ�������������
	%l �����־�¼��ķ���λ�ã��������־��Ϣ����䴦�������ڵ���ĵڼ���
	%m ���������ָ������Ϣ����log(message)�е�message
	%n ���һ���س����з���Windowsƽ̨Ϊ��rn����Unixƽ̨Ϊ��n��
	%p ������ȼ�����DEBUG��INFO��WARN��ERROR��FATAL������ǵ���debug()����ģ���ΪDEBUG����������
	%r �����Ӧ���������������־��Ϣ���ķѵĺ�����
	%t �����������־�¼����߳���

	���ԣ�
	%5p [%t] (%F:%L) - %m%n �ͱ�ʾ
	������5�����ȵȼ� �߳����� (�ļ���:�к�) - ��Ϣ �س�����*/
}