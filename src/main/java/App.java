import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//В классе App, по аналогии, вызовите еще раз бин HelloWorld, затем 2 раза вызовите бин cat.
// Сравните 2 пары бинов по ссылке и выведите результат в консоль.
// Для пары HelloWorld должно вернуться true, для cat - false.
// Так вы можете увидеть результат того, как работает наш контейнер.

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean0 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean0.getMessage());
        Cat beanCat = (Cat) applicationContext.getBean("cat");
        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        System.out.println((bean == bean0));
        System.out.println((beanCat1 == beanCat));
    }
}