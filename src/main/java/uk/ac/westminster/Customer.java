package uk.ac.westminster;

public class Customer {
    private String id;
    private Long name;
    private String email;
    private String address;

    public Customer(){

    }
    public Customer(Long name,String email,String address,String id) {
        this.id=id;
        this.name = name;
        this.email = email;
        this.address = address;
    }
    public Long getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }



}

