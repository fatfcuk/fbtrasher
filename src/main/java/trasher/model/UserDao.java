package trasher.model;

/**
 * Created by fatfcuk on 15.01.17.
 */
public interface UserDao {

    void login(String username, String password) throws Exception;

    void changeLanguageToEnglish();

    int deleteAllFriends();

    int unlikeAll();

    void tightenSecurity();

    void deleteAllPhotos();

    void setRandomPassword();

    void setRandomData();


}
