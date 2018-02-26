package log4j;
/**
 * Log4j入门
 * @author Administrator
 *
 */
public class Demo01 {
	//通常，我们写代码的过程中，免不了要输出各种调试信息。在没有使用任何日志工具之前，都会使用 System.out.println 来做到。 这么做直观有效，但是有一系列的缺点：
	//1. 不知道这句话是在哪个类，哪个线程里出来的
	//2. 不知道什么时候前后两句输出间隔了多少时间
	//3. 无法关闭调试信息，一旦System.out.println多了之后，到处都是输出，增加定位自己需要信息的
	public static void main(String[] args) {
        System.out.println("跟踪信息");
        System.out.println("调试信息");
        System.out.println("输出信息");
        System.out.println("警告信息");
        System.out.println("错误信息");
        System.out.println("致命信息");
	}
}
