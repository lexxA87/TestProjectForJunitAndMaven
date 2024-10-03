import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflection2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);

        // class1_name class2_name method_name string
        Class<?> classObject1 = Class.forName(scanner.next());
        Class<?> classObject2 = Class.forName(scanner.next());
        String methodName = scanner.next();
        String someString = scanner.next();

        Method m = classObject1.getMethod(methodName, classObject2);
        Object object1 = classObject1.newInstance();
        Object object2 = classObject2.getConstructor(String.class).newInstance(someString);

        m.invoke(object1, object2);

        System.out.println(object1);
    }
}
