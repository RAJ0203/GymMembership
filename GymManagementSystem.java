import java.util.*;

public class GymManagementSystem {

    static ArrayList<Member> members = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Add Member
    public static void addMember() {

        System.out.print("Enter Member ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Membership Plan (Monthly/Quarterly/Yearly): ");
        String plan = sc.nextLine();

        System.out.print("Assign Trainer: ");
        String trainer = sc.nextLine();

        Member m = new Member(id, name, age, phone, plan, trainer);
        members.add(m);

        System.out.println("Member Added Successfully!");
    }

    // View Members
    public static void viewMembers() {

        if (members.isEmpty()) {
            System.out.println("No Members Found.");
            return;
        }

        for (Member m : members) {
            m.displayMember();
        }
    }

    // Search Member
    public static void searchMember() {

        System.out.print("Enter Member ID to Search: ");
        int id = sc.nextInt();

        for (Member m : members) {
            if (m.memberId == id) {
                m.displayMember();
                return;
            }
        }

        System.out.println("Member Not Found.");
    }

    // Delete Member
    public static void deleteMember() {

        System.out.print("Enter Member ID to Delete: ");
        int id = sc.nextInt();

        Iterator<Member> it = members.iterator();

        while (it.hasNext()) {
            Member m = it.next();

            if (m.memberId == id) {
                it.remove();
                System.out.println("Member Deleted Successfully.");
                return;
            }
        }

        System.out.println("Member Not Found.");
    }

    // Renew Membership
    public static void renewMembership() {

        System.out.print("Enter Member ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Member m : members) {

            if (m.memberId == id) {

                System.out.print("Enter New Plan (Monthly/Quarterly/Yearly): ");
                String newPlan = sc.nextLine();

                m.plan = newPlan;

                System.out.println("Membership Renewed Successfully.");
                return;
            }
        }

        System.out.println("Member Not Found.");
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== GYM MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Member");
            System.out.println("2. View Members");
            System.out.println("3. Search Member");
            System.out.println("4. Delete Member");
            System.out.println("5. Renew Membership");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addMember();
                    break;

                case 2:
                    viewMembers();
                    break;

                case 3:
                    searchMember();
                    break;

                case 4:
                    deleteMember();
                    break;

                case 5:
                    renewMembership();
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);
    }
}