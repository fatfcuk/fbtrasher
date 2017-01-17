package trasher.service;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;
import trasher.model.UserDao;

/**
 * Created by fatfcuk on 15.01.17.
 */
public class UserService implements UserDao {

    private static final String DEBUGURL = "http://kissanime.ru/";

    private static final String LOGIN_PAGE = "http://www.facebook.com";
    private static final String LOGIN_FORM_ID = "login_form";
    private static final String USER= "siejajedrzej@gmail.com";
    private static final String PASSWORD = "noshitsherlock";

    @Override
    public  void login(String username, String password) throws Exception {


        final WebClient webClient = new WebClient();
        final HtmlPage htmlPage1 = webClient.getPage(LOGIN_PAGE);
        final HtmlPage htmlPage2 = webClient.getPage(DEBUGURL);

        final HtmlForm form = (HtmlForm) htmlPage1.getElementById(LOGIN_FORM_ID);





    }

    @Override
    public void changeLanguageToEnglish() {

    }

    @Override
    public int deleteAllFriends() {
        return 0;
    }

    @Override
    public int unlikeAll() {
        return 0;
    }

    @Override
    public void tightenSecurity() {

    }

    @Override
    public void deleteAllPhotos() {

    }

    @Override
    public void setRandomPassword() {

    }

    @Override
    public void setRandomData() {

    }
}
