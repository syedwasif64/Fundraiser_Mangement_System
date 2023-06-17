package finalproject;

import java.util.Date;

public class Fundraiser {
    private String description,compaign;
    private String startDate,EndDate;
    private double targetAmount;
    private double AmountGathered;

    public Fundraiser(String compaign,String description, String startDate, String EndDate, double targetAmount,double AmountGathered) {
        this.description = description;
        this.startDate = startDate;
        this.EndDate = EndDate;
        this.targetAmount = targetAmount;
        this.compaign=compaign;
        this.AmountGathered=AmountGathered;
    }

    public String getDescription() {
        return description;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public double getTargetAmount() {
        return targetAmount;
    }
    public String getCompaign(){
        return compaign;
    }
    public void amountgathered(double don){
        AmountGathered=AmountGathered+don;
    }
    public double getAmountGathered(){
        return AmountGathered;
    }
    public String dispayFund(){
        return ("\t\t------->FUND RAISING<-----\n" +"----->Campaign: " + compaign + "\n" +"----->Target Amount: " + targetAmount + "\n" +"----->Amount Gathered: " + getAmountGathered() + "\n" +"----->Start Date: " + startDate + "\n" +"----->End Date: " + EndDate);
    }
    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("------->FUND RAISING<-----\n");
    sb.append("----->Campaign: ").append(compaign).append("\n");
    sb.append("----->Target Amount: ").append(targetAmount).append("\n");
    sb.append("----->AMOUNT GATHERED: ").append(AmountGathered).append("\n");
    sb.append("----->Start Date: ").append(startDate).append("\n");
    sb.append("----->End Date: ").append(EndDate).append("\n");
    return sb.toString();
}

}
