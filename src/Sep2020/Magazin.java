package Sep2020;

import java.util.HashMap;

public class Magazin implements Subject{

    private HashMap<String, NotificariClienti> notificari = new HashMap<>();
    @Override
    public void register(String produs,String client, String tipNotificare) {

        NotificariClienti value = notificari.get(produs);

        if(tipNotificare.equals("Stoc")){
            value.getClientStoc().add();
        } else {
            value.reg..
        }

    }

    @Override
    public void unregister(Observer anObserver) {

    }

    @Override
    public void notifyRegisteredUsers(boolean notifiedValue) {

    }
}
