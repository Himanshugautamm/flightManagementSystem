public class Contact extends Passenger
{
    private String name,phone,email;

    public Contact(String name, String phone, String email)
    {
        this.name = name;
        this.phone = phone;
        this.email =email;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name=name;}

    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone=phone;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email=email;}

    void updateContactDetails(String contactDetails)
    {
        String parts[] = contactDetails.split(",");
        if(parts.length==3)
        {
            this.name =parts[0];
            this.phone =parts[1];
            this.email=parts[2];
        }
    }

}
