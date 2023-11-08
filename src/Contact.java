import java.util.Scanner;
public class Contact {

    private String email;

    private String phone;

    public Contact(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    public Contact() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, 
        //choose Tools | Templates.
    }
    
    
    public void createContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar su numero de celular");
       String phoneNumber = scanner.nextLine();
       setPhone(phoneNumber);
       System.out.println("Ingresar su correo electronico");
       String emailAddress = scanner.nextLine();
       setEmail(emailAddress);
}
}
