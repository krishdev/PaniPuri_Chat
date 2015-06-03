package krishna.com.panipuri_chat.interfaces;

/**
 * Created by user on 6/2/2015.
 */
public interface ISocketOperator {
    public String sendHttpRequest(String params);
    public int startListening(int port);
    public void stopListening();
    public void exit();
    public int getListeningPort();

}
