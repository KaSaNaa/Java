package LMS.Activity;

import java.util.Scanner;

class Rect {
    private float width, length, area;
    Scanner sc = new Scanner(System.in);
    

    public void SetWidth() {
        System.out.println("Enter width: ");
        float w = sc.nextFloat();
        width = w;
    }

    public void SetLength() {
        System.out.println("Enter length: ");
        float l = sc.nextFloat();
        length = l;
    }

    public void CalArea() {
        area = length * width;

    }

    public void ShowArea() {
        System.out.println("Area is " + area);

    }

}

class RectMain {
    public static void main(String[] args) {
        Rect rect1 = new Rect();
        rect1.SetWidth();
        rect1.SetLength();
        rect1.CalArea();
        rect1.ShowArea();

    }
}