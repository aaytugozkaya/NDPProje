package project;

public interface ISubject {
    public void ekle(IObserver subscriber);
    public void bildirimGonder(String bildirim);
}
