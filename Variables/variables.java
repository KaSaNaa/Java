package Variables;



public class variables {
    public static void main(String[] args) {

        // the reason why String variable is in different color is it is not a primitive data type
        //red coloured variables are primitive data types
        int helloWorld = 5;
        double num2 = 52.3;
        boolean condition = false; // boolean value - must be either true or false
        char c = 'A'; // char variable contains only a single character (Single quotation)
        String str = "Pasindu Ranawaka"; // A string can contain more than 1 character (Double Quotation)
        float x = 50.2f;
         /*if you assign just a decimal value, it will show an error. 
        it's because float variables are stored as doubles by default. you have to put an f after the value to convert it into a float.*/

        int tim = helloWorld; // taken the value from helloWorld and assigned to the tim



        System.out.println(helloWorld);
        System.out.println(num2);
        System.out.println(condition);
        System.out.println(c);
        System.out.println(str);
        System.out.println(tim);
        System.out.println(x);

    }
}
