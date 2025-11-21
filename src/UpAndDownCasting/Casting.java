package UpAndDownCasting;

public class Casting {
    public static void main (String[] args){
double ticketPrice = 3500.75;

float priceFloat = (float) ticketPrice;

int priceInt = (int) 3500.75;

//typecasting
        System.out.println("Original price (double): " + ticketPrice);
        System.out.println("Price as float: " + priceFloat);
        System.out.println("Price as int: " + priceInt);

        //downcasting
MovieTicket ticket1 = new VipMovieTicket(8000.25);
VipMovieTicket vipTicket = (VipMovieTicket) ticket1;
vipTicket.showTicketType();
    }
}
