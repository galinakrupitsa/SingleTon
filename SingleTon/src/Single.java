public class Single {

    private static Single instance;


    private Single() {
        System.out.println("Объект создан");
    }

    public static Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Привет из Singleton!");
    }
}