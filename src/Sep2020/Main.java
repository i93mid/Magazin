package Sep2020;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NotificariClienti notificariClienti = new NotificariClienti();
        notificariClienti.setClientStoc("Gogu");
        notificariClienti.setClientStoc("Gigi");
        notificariClienti.setClientStoc("manase");
        notificariClienti.setClientPret("Client pret1");
        System.out.println(notificariClienti.getClientStoc());
        System.out.println(notificariClienti.getClientPrice());
    }
}
