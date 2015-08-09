package profile;


import planet.entity.User;

public interface UserInfo {
    //Get USER by Login or by ID?
    User getUserByLogin(String login);
}
