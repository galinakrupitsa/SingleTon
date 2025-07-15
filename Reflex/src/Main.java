import java.lang.reflect.Field;
import java.lang.reflect.Method;

public static void main(String[] args) {
    // Получаем объект Class для класса Person
    Class<?> personClass = Person.class;

    // Выводим все поля (атрибуты)
    System.out.println("Поля класса:");
    Field[] fields = personClass.getDeclaredFields();
    for (Field field : fields) {
        System.out.println("- " + field.getName() + " : " + field.getType().getSimpleName());
    }

    // Выводим все методы
    System.out.println("\nМетоды класса:");
    Method[] methods = personClass.getDeclaredMethods();
    for (Method method : methods) {
        System.out.println("- " + method.getName());
    }
}