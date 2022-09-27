package LMS.Activity;

import java.util.Scanner;

class Room {
    protected String room_number;
    protected float room_daily_fee;
    protected float daysBooked;

    public void getRoomData(String room_number, float room_daily_fee, float daysBooked) {
        this.room_number = room_number;
        this.room_daily_fee = room_daily_fee;
        this.daysBooked = daysBooked;
    }

}

class LuxuryRoom extends Room {
    private float tax_amt;

    public void getTax(float tax_amt) {
        this.tax_amt = tax_amt;
    }

    public void CalandShowIncome() {
        float cal = (room_daily_fee * daysBooked) + tax_amt;
        System.out.print("Amount charged for your reservation: " + cal);
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter room number: ");
        var roomNum = sc.next();

        System.out.print("Enter daily fee: ");
        float dailyfee = sc.nextFloat();

        System.out.print("Number of Days booked: ");
        float bookedDays = sc.nextFloat();

        System.out.print("Enter tax amount for luxury room:  ");
        float tax = sc.nextFloat();

        LuxuryRoom r1 = new LuxuryRoom();
        r1.getRoomData(roomNum, dailyfee, bookedDays);
        r1.getTax(tax);
        r1.CalandShowIncome();

        sc.close();
    }
}