package filesDirectory;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonReflection {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Sankar");
        person.setLastName("Edala");
        person.setDateOfBirth("08-June-87");
        person.setSex("Male");
        /*Method[] methods = person.getClass().getDeclaredMethods();
        Stream.of(methods)
                .filter(method -> method.getName().startsWith("get"))
                .forEach(method -> {
            System.out.println(method.getName());
        });*/

       /* Method[] methods2 = person.getClass().getDeclaredMethods();
        Stream.of(methods2).map(x -> x.getAnnotation(SortedMethod.class))
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(SortedMethod::value))
                .forEach(
                x -> {
                    System.out.println(x.value());
                }
        );*/

       Comparator<Method> byAnnotation = Comparator.comparingInt(e -> e.getAnnotation(SortedMethod.class).value());

        Method[] methods3 = person.getClass().getDeclaredMethods();
        Stream.of(methods3)
                .filter(x -> x.getName().startsWith("get"))
                .sorted(byAnnotation)
                .map(Method::getName)
                .forEach(System.out::println);

    }
}
