package Sep2020;

public interface Subject {
    void register(Observer anObserver);
    void unregister(Observer anObserver);
    void notifyRegisteredUsers(boolean notifiedValue);
}
