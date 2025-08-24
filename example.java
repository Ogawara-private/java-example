public class example {
    public static void main(String[] args) {
        System.out.println("hello world");
        greet();
        print_name("山田");
        String msg = get_Greet();
        System.out.println(msg);
        int result = add(3, 5);
        System.out.println(result);

    }

    public static void greet() {
        System.out.println("こんにちは");

    }

    public static void print_name(String name) {
        System.out.println("私の名前は" + name + "です");

    }

    public static String get_Greet() {
        return "おはようございます";
    }

    public static int add(int a, int b) {
        return a + b;
    }
}