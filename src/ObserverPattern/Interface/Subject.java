package ObserverPattern.Interface;

/**
 * Created by pengshuang on 16/11/24.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
