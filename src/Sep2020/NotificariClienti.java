package Sep2020;

import java.util.ArrayList;

public class NotificariClienti implements Observer{

    private ArrayList<String> clientStoc = new ArrayList<>();

    private ArrayList<String> clientPret = new ArrayList<>();

    public NotificariClienti(ArrayList<String> clientStoc, ArrayList<String> clientPret) {
        this.clientStoc = clientStoc;
        this.clientPret = clientPret;
    }

    public void setClientStoc(ArrayList<String> clientStoc) {
        this.clientStoc = clientStoc;
    }

    public void setClientPret(ArrayList<String> clientPret) {
        this.clientPret = clientPret;
    }

    public ArrayList<String> getClientStoc() {
        return clientStoc;
    }

    public ArrayList<String> getClientPret() {
        return clientPret;
    }

    @Override
    public void update(String updatedValue) {
        if(updatedValue.equals("Schimbare Stoc")){
            System.out.println("Stocul s-a modificat");
        } else{
            System.out.println("Pretul s-a modiciat");
        }
    }
}
