package krishna.com.panipuri_chat.interfaces;

import krishna.com.panipuri_chat.types.FriendInfo;
import krishna.com.panipuri_chat.types.MessageInfo;

/**
 * Created by user on 6/2/2015.
 */
public interface IUpdateData {
    public void updateData(MessageInfo[] messages, FriendInfo[] friends, FriendInfo[] unApprovedFriends, String userKey);

}
