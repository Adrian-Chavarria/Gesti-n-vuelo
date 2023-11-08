public class Person {

    private String idUser;

    private String name;

    private Contact contact;

    public Person(String idUser, String name, Contact contact) {
        this.idUser = idUser;
        this.name = name;
        this.contact = contact;
    }

    public Person() {
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
}
