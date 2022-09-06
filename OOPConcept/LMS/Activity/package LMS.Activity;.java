package LMS.Activity;

class Rect {
    private float width, length, area;

    public void SetWidth(int w) {

        width = w;
    }

    public void SetLength(int l) {
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
        rect1.SetWidth(5);
        rect1.SetLength(6);
        rect1.CalArea();
        rect1.ShowArea();

    }
}