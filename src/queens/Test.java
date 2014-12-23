package queens;

class Hotel {
    public int bookings;
    public void book() {
        bookings++;
        bookings++;
        bookings++;
    }
}

public class Test extends Hotel {
    public void book() {
        bookings--;
    }
    
    public void book(int size) {
        book();
        super.book();
        bookings += size;
    }
    
    public static void main(String args[]) {
        Test hotel = new Test();
        hotel.book(2);
        System.out.print(hotel.bookings);
    }
}
