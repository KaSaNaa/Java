class Keyboard {
    private String color;
    public String returnColor(){
        color = "Black";
        return color;
    }

}

class KeyMain {
    public static void main(String[] args) {
        Keyboard x = new Keyboard();
        /* 
        *x.color = "Black";
        *System.out.print(x.color); 
        */ // these lines won't run as color method is private

        System.out.print(x.returnColor());
    }
}
