package adapter;

public class InformationSubmit {
    String username = null;
    String passwd = null;
    int age = 0;
    String address = null;
    String telephoneNumber = null;

    public InformationSubmit(String username, String passwd, int age, String address, String telephoneNumber) {
        this.username = username;
        this.passwd = passwd;
        this.age = age;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }
}
