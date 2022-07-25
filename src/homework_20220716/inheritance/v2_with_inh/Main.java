package homework_20220716.inheritance.v2_with_inh;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        Moderator moderator = new Moderator();
        Administrator administrator = new Administrator();

        user.readPost();
        user.writePost();

        System.out.println();

        moderator.readPost();
        moderator.writePost();
        moderator.deletePost();

        System.out.println();

        administrator.readPost();
        administrator.writePost();
        administrator.deletePost();
        administrator.blockUser();
    }
}
