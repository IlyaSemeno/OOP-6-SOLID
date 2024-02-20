package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        UserReporter userReporter = new UserReporter(user);
        userReporter.report();

        UserRepository userRepository = new UserRepository();
        userRepository.save(user);
    }
}