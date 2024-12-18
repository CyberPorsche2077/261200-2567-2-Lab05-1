import java.time.LocalDate;

public class User {
    private String name ;
    private LocalDate dob ;

    void User() {
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name , LocalDate dob){
        this.name = name;
        this.dob = dob;
    }

    public void displayInfo(){
        System.out.println("User Name: " + name);
        System.out.println("Date Of Birth: " + dob);
    }
}

