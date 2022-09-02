package ClassroomActivities;

class Mic {
    private String color; // declared a private attribute called color
    // every data value must be labeled as private as they are very important and cannot be changed by outside.

    public void SetColor(String col) { 
        //calls the private attribute in the same method(color) to assign a value via a public label

        color = col; /* comment in line 14 */

        //you have to call those private methods inside this public method

        Show(); /* this show method is nested method 
                * (if a method is defined inside another method, the inner method is said to be nested inside the outer method)
                */
    }

    private void Show() {

        // if this method is private, you have to use another public method in the same class to call it. ** Check line 10 **
        
        System.out.println("color is " + color);
    }
}

class MicMain {
    public static void main(String[] args) {
        Mic a = new Mic();
        a.SetColor("Black");
        //a.Show();
        Mic b = new Mic();
        b.SetColor("Blue");
        //b.Show();

    }
}
