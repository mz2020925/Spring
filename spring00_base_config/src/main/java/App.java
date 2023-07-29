import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // 3.创键一个连接IoC容器的”管道“对象并连接上IoC容器（applicationContext.xml就是IoC容器）
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 4.获取Bean
        // 4.1获取BookDao对象（Bean）
        // BookDao bookDao =(BookDao) ctx.getBean("bookDao");
        // bookDao.save();

        // 4.2获取BookService对象（Bean）
        // BookService bookService =(BookService) ctx.getBean("bookService");
        BookService bookService =(BookService) ctx.getBean("service");
        bookService.save();

        // 检验bean的scope属性的作用
        // BookService bookService2 =(BookService) ctx.getBean("service");
        // System.out.println(bookService);
        // System.out.println(bookService2);

    }
}
