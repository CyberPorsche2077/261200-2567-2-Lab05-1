import java.time.LocalDate;

public class Admin extends User{
    private String role;
    public Admin(String name ,int year,int month,int day){
        super();
        this.role = "Admin";
    }

    public void displayInfo(boolean full) {
        super.displayInfo();
        if(full == true){
            System.out.println("User Type: " + role);
        }
    }
}
