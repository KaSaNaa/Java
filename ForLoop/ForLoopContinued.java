package ForLoop;

public class ForLoopContinued {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        String names[] = new String[5];

        int count = 0;
        for (int element : arr) {
            System.out.println(element + " " + count);
            count++;
        }
        /*
        *01:27
        everytime we loop through this loop we're gonna declare a new variable called "element" 
        and it's gonna be equal to the next element in the "arr" array.
        */ 

    }
}
