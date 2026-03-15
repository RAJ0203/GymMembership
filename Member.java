public class Member {

    int memberId;
    String name;
    int age;
    String phone;
    String plan;
    String trainer;

    public Member(int memberId, String name, int age, String phone, String plan, String trainer) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.plan = plan;
        this.trainer = trainer;
    }

    public void displayMember() {
        System.out.println("---------------------------");
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Plan: " + plan);
        System.out.println("Trainer: " + trainer);
    }
}