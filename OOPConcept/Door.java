// Write an OOP to display a msg under method called for door x.

class Door {
    private  /* private access modifier */ void Open() {  
        /* 
        *The methods or data members declared as private are 
        *accessible only within the class in which they are declared. 
         */

        System.out.print("Opening");
    }
    public void display(){
        Open();
    }
    
}

class DoorMain {
    public static void main(String[] args) {
        Door x = new Door();
        //x.Open();

        /* 
        *so the method called Open() cannot be used by any other classes.
         */

         x.display();
         /*
          * in here we call "private Open()" method in "class Door", by a
          * "public display()" method in the same class.
          */

    }
}
