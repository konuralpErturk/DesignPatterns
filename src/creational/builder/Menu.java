package creational.builder;

public class Menu
{
    private String burgerType; //required
    private String sideMenuType; //required
    private String drinkType; //required
    private String toy; //optional

    private Menu(MenuBuilder builder) {
        this.burgerType = builder.burgerType;
        this.sideMenuType = builder.sideMenuType;
        this.drinkType = builder.drinkType;
        this.toy = builder.toy;
    }

    @Override
    public String toString() {
        return "Menu: "+this.burgerType+", "+this.sideMenuType+", "+this.drinkType+", "+this.toy+"";
    }

    public static class MenuBuilder
    {
        private String burgerType;
        private String sideMenuType;
        private String drinkType;
        private String toy;

        public MenuBuilder(String burgerType,String sideMenuType,String drinkType)
        {
            this.burgerType   = burgerType;
            this.sideMenuType = sideMenuType;
            this.drinkType    = drinkType;
        }

        public MenuBuilder toy (String toy)
        {
            this.toy = toy;
            return this;
        }

        public Menu build()
        {
            Menu menu = new Menu(this);
            return menu;
        }
    }
}
