import com.github.lamzier.pojo.Books;
import com.github.lamzier.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookServiceImpl");
        for (Books books : bookService.queryAllBook()) {
            System.out.println(books);
        }

    }
}
