import java.util.List;

/**
 * @author 28953
 * @create 2023-05-25 21:53
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("1001",new User(1001,34,"Tom"));
        dao.save("1002",new User(1002,33,"Jerry"));
        dao.save("1003",new User(1003,25,"Mike"));

        dao.update("1003",new User(1003,22,"Marry"));
        dao.delete("1002");
        List<User> list = dao.list();
        System.out.println(list);
    }
}
