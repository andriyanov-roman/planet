package profile;

import planet.services.interfaces.ProfileService;

public class Profile implements ProfileService {
    private String login;

    private String[] suggestedGoods;

    @Override
    public Profile getUserProfile(String login)
    {
        Profile mockProfile = new Profile();
        mockProfile.login = login;
        mockProfile.suggestedGoods[0] = "Pilesos";
        mockProfile.suggestedGoods[1] = "Holodilnik";
        mockProfile.suggestedGoods[2] = "Fen";
        return mockProfile;

    }
}
