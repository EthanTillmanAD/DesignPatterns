package patterns.creational.factory.creatingOurOwn;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType type){
        switch (type){
            case BLOG:{
                return new Blog();

            }
            case SHOP:{
                return new Shop();

            }
            default:{
                return null;
            }

        }
    }
}
