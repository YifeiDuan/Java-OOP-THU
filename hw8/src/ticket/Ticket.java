package ticket;

public class Ticket extends Thread{
    TicketPool pool;
    int ticket_req;
    public Ticket(TicketPool tpl, int treq){
        pool = tpl;
        ticket_req = treq;
    }
    public void run(){
        synchronized (pool){
            if(ticket_req <= pool.getRest()){
                pool.reduceRest(ticket_req);
            }
            else{
                ticket_req = pool.getRest();
                pool.reduceRest(ticket_req);
            }
        }
    }
    public int getObtained(){
        return ticket_req;
    }
}
