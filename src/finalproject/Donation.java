package finalproject;

import java.util.Date;

public class Donation {
    private Donor donor;
    private double amount;
    private String purpose;
    public Donation(Donor donor, double amount, String purpose) {
        this.donor = donor;
        this.amount = amount;
        this.purpose = purpose;
    }
    public Donation(double amount,String purpose){
        this.amount=amount;
        this.purpose=purpose;
    }
     public String getDonorName(){
        return donor.getName();
    }
    public String getDonorPhone() {
        return donor.getPhoneNo();
    }
    public String getDonorEmail(){
        return donor.getEmail();
    }
    public String getDonorAddress(){
        return donor.getAddress();
    }
    public String getDonorHistory(){
        return donor.getDonationHistory();
    }
    public double getAmount() {
        return amount;
    }
    public String getPurpose() {
        return purpose;
    }
   
    public String displayRecieptforAdmin(){
        return(donor.displayDonorForAdmin()+"\n---->AMOUNT DONATING:     "+amount+"\n---->PURPOSE OF DONATION: "+purpose+"\n\n");
    }
    public String displayRecieptForUser(){
        String print=donor.displayDonorsForUsers();
        return (print+"\n------>AMOUNT DONATING:     "+amount+"\n------>PURPOSE OF DONATION: "+purpose+"\n");
    }
       
}
