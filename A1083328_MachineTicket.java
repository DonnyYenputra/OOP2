import java.security.SecureRandom;

class A1083328_ticketMachine implements Runnable{

    private String machine;
    public static int tickets =10000;
    public int Max_ticket=4;
    private int sold;
    Thread th;
    SecureRandom random = new SecureRandom();

    public A1083328_ticketMachine(String machine){
        this.machine = machine;
        sold = 0;
        th = new Thread(this, machine);
        th.start();
    }

    public void run(){
        while(available()){
            int sellAmount = 1+random.nextInt(Max_ticket);
            if (sellAmount<=tickets){
                Ticket(sellAmount);
                sold+=sellAmount;

                System.out.println(sellAmount + " ticket(s) sold at " + machine + ".");
            }
        }

        System.out.println("Total tickets sold at " + machine + " is " + sold + ".");

    }

    public boolean available(){
        if(tickets>0){
            return true;
        }else{
            return false;
        }
    }

    private synchronized static void Ticket(int sellAmount){

        tickets-=sellAmount;
        return;

    }
}
public class A1083328_MachineTicket{

    public static void main (String[] args){

        A1083328_ticketMachine m1 = new A1083328_ticketMachine("Machine 1");
        A1083328_ticketMachine m2 = new A1083328_ticketMachine("Machine 2");
        A1083328_ticketMachine m3 = new A1083328_ticketMachine("Machine 3");


    }

}

    



    
