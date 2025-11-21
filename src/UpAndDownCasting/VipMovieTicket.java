package UpAndDownCasting;

public class VipMovieTicket extends MovieTicket {
    VipMovieTicket(double price){
        super(price);
    }
@Override
    void showTicketType(){
    System.out.println("VIP Movie Ticket");
}
    }

