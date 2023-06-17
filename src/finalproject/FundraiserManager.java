
package finalproject;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class FundraiserManager {
 
    ArrayList<Fundraiser> fundraisers=new ArrayList();
    ArrayList<Fundraiser> compaignsEnded=new ArrayList();
    ArrayList<Fundraiser> amountComplete=new ArrayList();
    ArrayList<Donation> donations=new ArrayList();
    private Object LocalDate;
    //ADDING FUNDRAISER
    public void addFundRaiser(Fundraiser fr)
    {
        fundraisers.add(fr);
    }
    //VIEWING FUNDRAISERS
    public String viewFundRaisers(){
         if (this.fundraisers.isEmpty()) {
          return("Zero FundRaising Compaign");
        }
         else {
            StringBuilder stringBuilder = new StringBuilder();
            for (Fundraiser fund : fundraisers) {
            stringBuilder.append(fund.toString()).append("\n");
        }
        return stringBuilder.toString();
         }
    }
    
    public String deleteFundraiserByName(String name) {
        DataBase db=new DataBase();
    Fundraiser fundraiserToDelete = null;
    for (Fundraiser fundraiser : fundraisers) {
        if (fundraiser.getCompaign().equalsIgnoreCase(name)) {
            fundraiserToDelete = fundraiser;
            break;
        }
    }
    if (fundraiserToDelete != null) {
        fundraisers.remove(fundraiserToDelete);
        String a=db.deleteFundRaiserFromDB(name);
        return(a);
    } else {
        return("Fundraiser '" + name + "' not found.");
    }
    }
    //ADD DONATION TO AVAILABLE FUNDRAISER
   public double addDonationToFundRaiser(String name,double donated){
        Fundraiser donate = null;
        double amount=0;
    for (Fundraiser fundraiser : fundraisers) {
        if (fundraiser.getCompaign().equalsIgnoreCase(name)) {
            donate = fundraiser;
            fundraiser.amountgathered(donated);
            amount=fundraiser.getAmountGathered();
            break;
        }
    }
        return amount;
    }
   //ADDING DONOR TO ORGANIZATION
    public void addDonor(Donation donation){ donations.add(donation);}
    
    //DISPLAYIN DONOR INFORMATION FOR AMDIN (each and every detail)
    public String displayDonorsforAdmins(){
        if (donations.isEmpty()) {
            return("=======>>>CURRENTLY THERE ARE NO DONORS<<<=======");
        }
        else{
            StringBuilder sb = new StringBuilder();
         for (Donation d : donations) {
             sb.append(d.displayRecieptforAdmin()).append("\n");
         }
         return sb.toString();
        }
    }
    
    //DISPLAYING DONOR INFORMATION FOR USER
    public String displayDonorsForUsers(){
        if (donations.isEmpty()) {
            return("====>CURRENTLY THERE IS NO DONORS");
        }
        else{
            StringBuilder sb = new StringBuilder();
        for (Donation d : donations) {
            sb.append(d.displayRecieptForUser()).append("\n");
        }
        return sb.toString();

        }
    }
    
    //DISPLAYING DONATIONS OF CURRENT USER
    public String displayMyDonations(String name){
        int c = 1;
        int a = 0;
        StringBuilder sb = new StringBuilder();
            for (Donation d : donations) {
                if (d.getDonorName().equalsIgnoreCase(name)) {
                    if (c == 1) {
                        sb.append("Name: ").append(name).append("\n");
                    }
                sb.append("Donation Amount: ").append(d.getAmount()).append("\n");
                sb.append("Donation Purpose: ").append(d.getPurpose()).append("\n\n");
                c++;
                a++;
        }
    }
        if (a == 0) {
            return "No donations found for the given donor.";
        }
      return sb.toString();
    }
    
    //Check dates if matching with the end dates
    public void datesMatcheD(){
        SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date();
        String curDate = dateF.format(currentDate);
         Iterator<Fundraiser> iterator = fundraisers.iterator();
        while (iterator.hasNext()) {
            Fundraiser fundraiser = iterator.next();
            if (fundraiser.getEndDate().equals(curDate)) {
                iterator.remove();
                compaignsEnded.add(fundraiser);
            }
        }
    }
    
    //checking gathered amount with target amount
    public void amountCompleted(){
         Iterator<Fundraiser> iterator = fundraisers.iterator();
        while (iterator.hasNext()) {
            Fundraiser fundraiser = iterator.next();
            if (fundraiser.getAmountGathered()>= fundraiser.getTargetAmount()) {
                iterator.remove();
                amountComplete.add(fundraiser);
            }
        }
    }
    
    //DISPLAYING EXPIRED COMPAIGNS
    public String expiredCompaigns(){
         if (this.compaignsEnded.isEmpty()) {
            return("*** NO  COMPAIGN  HAS  EXPIRED****");
        } else {
             StringBuilder stringBuilder = new StringBuilder();
             stringBuilder.append("===> EXPIRED FUNDRAISING CAMPAIGNS <===\n");
                for (Fundraiser fund : compaignsEnded) {
                    stringBuilder.append(fund.dispayFund()).append("\n");
                }
        return stringBuilder.toString();
        }
    }   
    //DISPLAYING COMPLETED COMPAIGNS
    public String displayCompletedCompaigns(){
        if (this.amountComplete.isEmpty()) {
            return("*****NO  COMPAIGN  HAS  COMPLETED  YET****");
        }
        else{
            StringBuilder sb = new StringBuilder();
            sb.append("***** COMPLETED FUNDRAISING CAMPAIGNS *****\n");
                for (Fundraiser fund : amountComplete) {
                    sb.append("Campaign Name: ").append(fund.getCompaign()).append("\n");
                    sb.append("Amount Gathered: ").append(fund.getAmountGathered()).append("\n");
                    sb.append("Targeted Amount: ").append(fund.getTargetAmount()).append("\n");
                    sb.append("Campaign Description: ").append(fund.getDescription()).append("\n");
                    sb.append("\n");
        }
            return sb.toString();
    }
    }
    public boolean login(String name,String phone){
        boolean b=false;
        for(Donation donor:donations){
            if (donor.getDonorName().equalsIgnoreCase(name)||donor.getDonorPhone().equalsIgnoreCase(phone)) {
                b=true;
            }
        }
        return b;
    }
    public Donation loginEnter(String name,String phone){
        Donation d=null;
        boolean con=login(name,phone);
        if (con) {
            for(Donation donor:donations){
                if (donor.getDonorName().equalsIgnoreCase(name)||donor.getDonorPhone().equalsIgnoreCase(phone)) {
                d=donor;
                break;
                }
            }
        }
        return d;
    }
}
