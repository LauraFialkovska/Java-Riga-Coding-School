package homework_20220716.inheritance.v2_with_inh;

public class Administrator extends Moderator {

    @Override
    public void writePost() {
        System.out.println("Administrator: writing post");
    }

    public void blockUser() {
        System.out.println("Blocking user");
    }
}
