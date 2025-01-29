public class Contacts {
    private String name;
    private long phoneNumber;
    private String email;

    // Constructor
    Contacts(){
        name = "No Name";
        phoneNumber = 1122334455;
        email = "noname@gmail.com";
    }

    Contacts(String name, long phoneNumber, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // getters and setters methods.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name + "," + phoneNumber + "," + email;
    }
}
