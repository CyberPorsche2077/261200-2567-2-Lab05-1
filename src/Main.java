import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User John = new User("John", 1954,2,18);
        John.displayInfo();
        Admin nicolas = new Admin("nicolas",1964,1,7);
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
    }
}