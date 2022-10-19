public class fizzbuzz {
    public static void main(String[] args) {
        int length = 100;
        int x;
        int y;
        for (int i = 0 ; i <= length ; i++) {
            x = i;
            y = i;
            while (x>=5) {
                x = x-5;
            }
            while (y>=3) {
                y = y-3;
            }
            if (x == 0 && y == 0) {
                System.out.println("fizzbuzz");
            } else if (x == 0){
                System.out.println("buzz");
            } else if (y == 0){
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}