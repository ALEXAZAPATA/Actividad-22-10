public class BilleteraParque{
private int tickets;
private static boolean festivo = false;

public BilleteraParque(int tickets, boolean festivo){
    this.tickets = tickets;
    this.festivo = festivo;



}
public int getTickets(){
    return this.tickets;
}

public static getFestivo(){
    return this.festivo;
}

public void setTickets(int tickets){
    this.tickets = tickets;
}

public static setFestivo(boolean festivo){
    this.festivo = festivo;

}

public void agregarTickets(int){

}

public boolean removerTickets(int){
    
}


}