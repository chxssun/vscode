package class21Method;

public class Method {
    public static void main(String[] args) {
    
        System.out.println(sum(2, 5));
        sumPrint(2,5);
        System.out.println(getName());
        todayWeather();

        int intArr[10];
        int intArrr;
        intArrr = new int[10];
        int intAAr[] = new int[10];
    }

    public static int sum(int a, int b){
        return a + b;
    }
    public static void sumPrint(int a, int b){
        System.out.println(a + b);
    }
    public static String getName() {
        return "천둥이";
    }
    public static void todayWeather() {
        System.out.println("오늘은 비");
    }


}
