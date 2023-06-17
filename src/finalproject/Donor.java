package finalproject;
public class Donor {
    private String name,address,email,phoneNo,donationHistory,password;

    //Kuch bhi
    public Donor(String name, String address, String email, String phoneNo, String donationHistory) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNo = phoneNo;
        this.donationHistory = donationHistory;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getDonationHistory() {
        return donationHistory;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String displayDonorForAdmin(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n--->NAME OF DONOR: ").append(name)
                .append("\n--->ADDRESS OF DONOR: ").append(address)
                .append("\n--->EMAIL OF DONOR: ").append(email)
                .append("\n--->PHONE NUMBER OF DONOR: ").append(phoneNo)
                .append("\n--->DONATION HISTORY: ").append(donationHistory);
        return sb.toString();
    }
    public String displayDonorsForUsers(){
        return("---->NAME OF DONOR: "+name+"\n---->EMAIL OF DONOR: "+email);
    }
}
