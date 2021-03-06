package krishna.com.panipuri_chat.interfaces;

import java.io.UnsupportedEncodingException;

/**
 * Created by user on 6/2/2015.
 */
public interface IAppManager {

    public String getUsername();
    public String sendMessage(String username,String tousername, String message) throws UnsupportedEncodingException;
    public String authenticateUser(String usernameText, String passwordText) throws UnsupportedEncodingException;
    public void messageReceived(String username, String message);
    //	public void setUserKey(String value);
    public boolean isNetworkConnected();
    public boolean isUserAuthenticated();
    public String getLastRawFriendList();
    public void exit();
    public String signUpUser(String usernameText, String passwordText, String email, String age, String phno, String gen);
    public String addNewFriendRequest(String friendUsername);
    public String sendFriendsReqsResponse(String approvedFriendNames,
                                          String discardedFriendNames);

}
