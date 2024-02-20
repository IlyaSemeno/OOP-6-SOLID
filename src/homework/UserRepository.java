package homework;

public class UserRepository {
    public void save(User user) {
        Persister persister = new Persister(user);
        persister.save();
    }
}
