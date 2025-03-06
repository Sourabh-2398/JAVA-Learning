public class Practice {

    static Integer i =1;
    public static void main(String[] args) {
        System.out.println(i);
        m(i);
        System.out.println(i);
    }

    private static void m(Integer i) {
        i+=2;
    }
}
