import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        // 3 ways
        Class<?> personClass = Person.class;
        Class<?> personClass2 = person.getClass();
        Class<?> personClass3 = Class.forName("Person");

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + " -> " + method.getReturnType() +
                    " -> " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("* * * * *");

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " -> " + field.getType());
        }
        System.out.println("* * * * *");

        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof AuthorInfo)
                System.out.println("Yes! It has AuthorInfo!!!");
        }
    }
}
