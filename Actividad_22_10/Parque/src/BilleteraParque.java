public class BilleteraParque{
private int tickets;
private static boolean festivo = false;

public BilleteraParque(int tickets, boolean festivo){
    this.tickets = tickets;
    this.festivo = festivo;



}
public BilleteraPrque(){
    return this.tickets = 0;
}
public BilleteraPrque(int tickets){
    return this.tickets = tickets;
}
public int getTickets(){
    return this.tickets;
}
public static getFestivo(){
    return this.festivo;
}

public void setTickets(int tickets){
   if(tickets>0){
       return this.tickets;
   }
}

public static setFestivo(boolean festivo){
  if(festivo = false){
    return true;
        }
    return false;
}

public void agregarTickets(int num){
    if(tickets >= 0 && num > 0 ){
     this.tickets += num;
    }
}

public boolean removerTickets(int num){
    if (tickets > 0 && tickets > num){
     this.tickets -=num;
    return true;
    
}

return false;

}

public String toString(){
    return "tickets"+ tickets+
           "festivo?"+ festivo?
           "agregar tickets" +agregarTickets()+
            "remover tickets" +removerTickets();
}

}
