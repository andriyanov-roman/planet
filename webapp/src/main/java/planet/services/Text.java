package planet.services;


import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class Text extends ResourceBundle {

    private static final String TEXT_ATTRIBUTE_NAME = "Text";
    private static final String TEXT_BASE_NAME = "Text";

    private Text(Locale locale) {
        setLocale(locale);
    }

    public static void setFor(HttpServletRequest request) {
        if (request.getSession().getAttribute(TEXT_ATTRIBUTE_NAME) == null) {
            request.getSession().setAttribute(TEXT_ATTRIBUTE_NAME, new Text(request.getLocale()));
        }
    }

    public static Text getCurrentInstance(HttpServletRequest request) {
        return (Text) request.getSession().getAttribute(TEXT_ATTRIBUTE_NAME);
    }

    public  void setLocale(Locale locale) {
        if (parent == null || !parent.getLocale().equals(locale)) {
            setParent(getBundle(TEXT_BASE_NAME, locale));
        }
    }
//    public void execute(HttpServletRequest request,
//            HttpServletResponse response) throws ServletException, IOException {
////        logger.info("Change user locale");
//        Locale locale = new Locale("en", "US");
//        String language = request.getParameter("lang");
//        int number = Integer.parseInt(language);
//        switch (number) {
//            case 1: {
//                locale = new Locale("ru", "RU");
////                logger.info("Locale - RU");
//                break;
//            }
//            case 2: {
//                locale = new Locale("en", "US");
////                logger.info("Locale - US");
//                break;
//            }
//        }
//        HttpSession session = request.getSession(true);
//        Config.set(session, Config.FMT_LOCALE, locale);
//        setLocale(locale);
//    }

    @Override
    public Enumeration<String> getKeys() {
        return parent.getKeys();
    }

    @Override
    protected Object handleGetObject(String key) {
        return parent.getObject(key);
    }

}
