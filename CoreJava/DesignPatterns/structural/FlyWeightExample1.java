package Design_pattern.structural;

import java.util.Map;
import java.util.HashMap;  
import java.util.Scanner;
interface Ticket {
    public void setName(String name);
    public void setFare(int fare);
    public void printTicket();
}


 class RailwayTicket implements Ticket {
    private String type;//intrinisic state
    private int fare;//intrinsic state
    private String name;//Extrinsic State
  
    public RailwayTicket(String type){
        this.type = type;
    }
  
    public void setName(String name){
        this.name = name;
    }
  
    public void setFare(int fare){
        this.fare = fare;
    }
  
    @Override
    public void printTicket(){
        System.out.println("--------TICKET--------");
        System.out.println("Name : "+ name + "\nTicket Type : "
            + type + "\nFare : " + fare);
    }
}

 
 class TicketFactory {
    private static Map<String, Ticket> ticketMap 
        = new HashMap<String, Ticket>();
 
    public static Ticket getTicket(String type, String name, int fare){
        Ticket ticket;
        if(ticketMap.containsKey(type)){
            ticket = ticketMap.get(type);
        } else {
            ticket = new RailwayTicket(type);
            ticketMap.put(type, ticket);
        }
   
        ticket.setName(name);
        ticket.setFare(fare);
   
        return ticket;
    } 
}




 
 
public class FlyWeightExample1 {
    public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
 	Ticket ticket;
   
 for(int i=0; i < 5; i++){
     System.out.println("Enter ticket type, Name and Fare");
     String[] stringList = scan.nextLine().split(" ");
     ticket = TicketFactory.getTicket(stringList[0], stringList[1],
               Integer.parseInt(stringList[2]));
     ticket.printTicket();
 }
    }
}