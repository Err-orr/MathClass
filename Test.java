public class Test {
    public static void main(String[] args) {
        double ran = Math.random();
        int max = 1010;
        int min = 1000;
        int answer = (int) (ran * (max - min) + min);
        String construct = "HELLO, (" + answer + ") AMAZING NUMBER RIGHT!?";
        System.out.println(answer);
        System.out.print(construct);
    }
}
