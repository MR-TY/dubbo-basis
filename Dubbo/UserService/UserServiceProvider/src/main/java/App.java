import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("file:D:\\Java\\Dubbo\\UserService\\UserServiceProvider\\src\\main\\resources\\provider.xml");
        ioc.start();
        System.in.read();
    }
}
