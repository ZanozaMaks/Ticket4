public class Main {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
                System.out.println(" ");

            }

            int a = array.length;

            for (int i = 0; i < a / 2; i++) {
                int reverseArray = array[a - i - 1];
                array[a - i - 1] = array[i];
                array[i] = reverseArray;
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
                System.out.println(" ");
            }
        }
    }

}