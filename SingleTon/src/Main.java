public class Main {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();

        s1.showMessage();

        System.out.println(s1 == s2);
    }
}