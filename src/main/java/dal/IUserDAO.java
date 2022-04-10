package dal;

public interface IUserDAO {

    boolean existUserByUsernameAndPassword(String username,String password);

}
