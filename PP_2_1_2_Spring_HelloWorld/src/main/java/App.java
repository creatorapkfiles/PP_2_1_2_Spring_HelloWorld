import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanOne.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCatOne =
                (Cat) applicationContext.getBean("cat");
        Cat beanCatTwo =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanOne.equals(beanTwo));
        System.out.println(beanCatOne.equals(beanCatTwo));
    }
}