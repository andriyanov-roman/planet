package profile;


import planet.entity.Product;
import planet.services.interfaces.ProfileService;

public class Profile implements ProfileService {
    private String login;

    private Product[] suggestedGoods = new Product[3];

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Product[] getSuggestedGoods() {
        return suggestedGoods;
    }

    public void setSuggestedGoods(Product[] suggestedGoods) {
        this.suggestedGoods = suggestedGoods;
    }

    @Override
    public Profile getUserProfile(String login)
    {
        this.login = login;

        Product holodilnik = new Product();
        holodilnik.setName("This is Holodilnik");
        holodilnik.setPrice(10000.00);
        holodilnik.setId(121);

        Product iphone = new Product();
        iphone.setName("This is iPhone");
        iphone.setPrice(18000.00);
        iphone.setId(421);

        Product duhovka = new Product();
        duhovka.setName("This is Duhovka");
        duhovka.setPrice(7000.00);
        duhovka.setId(235);


        suggestedGoods[0] = holodilnik;
        suggestedGoods[1] = iphone;
        suggestedGoods[2] = duhovka;
        return this;

    }
}
