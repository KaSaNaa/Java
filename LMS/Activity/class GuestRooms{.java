package LMS.Activity;

import java.util.Scanner;

class GuestRooms {
    private int roomNum;
    private int FeeForDay;
    private int days;
    private int roomIncome;
    private static int resFee = 1000;
    Scanner sc = new Scanner(System.in);


    public void setroomNum() {
        System.out.print("Enter room number: ");
        int roomNum = sc.nextInt();
        this.roomNum = roomNum;
    }

    public void SetFeeForDay() {
        System.out.print("Enter fee for a day: ");
        int FeeForDay = sc.nextInt();
        this.FeeForDay = FeeForDay;

    }

    public void SetDays() {
        System.out.print("Enter number of days reserved: ");
        int days = sc.nextInt();
        this.days = days;
    }

    public void CalTotal() {
        int Total = (FeeForDay * days) + resFee;
        this.roomIncome = Total;
        ShowIncome();

    }

    private void ShowIncome() {
        System.out.println("\n\n\t\t\t------ Room Number " + roomNum + "------\t\t\t\n");
        System.out.println("Number of days reserved : " + days);
        System.out.println("Total charge for your reservation (including reservation fee) :" + roomIncome);
    }

}

class MainRoom {
    public static void main(String[] args) {
        GuestRooms x = new GuestRooms();
        x.setroomNum();
        x.SetFeeForDay();
        x.SetDays();
        x.CalTotal();


    }
}