package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DataBase {
    public String addDonorToDB(String name, String email, String phone, String history, String address, String purpose, double amount) {
        String url = "jdbc:ucanaccess://FundRaising.accdb";
        String select = "SELECT * FROM Donors WHERE Name = ?";
        String updateQuery = "UPDATE Donors SET Amount = Amount + ? WHERE Name = ?";
        String insertQuery = "INSERT INTO Donors (Name, Email, Phone, `Donation History`, Address, Purpose, Amount) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url);
             PreparedStatement selectStmt = con.prepareStatement(select);
             PreparedStatement updateStmt = con.prepareStatement(updateQuery);
             PreparedStatement insertStmt = con.prepareStatement(insertQuery)) {

            selectStmt.setString(1, name);
            ResultSet resultSet = selectStmt.executeQuery();

            if (resultSet.next()) {
                // Name exists, update the amount
                updateStmt.setDouble(1, amount);
                updateStmt.setString(2, name);
                int rowsUpdated = updateStmt.executeUpdate();

                if (rowsUpdated > 0) {
                    return "Amount updated successfully.";
                } else {
                    return "Error in updating amount.";
                }
            } else {
                // Name doesn't exist, insert a new row
                insertStmt.setString(1, name);
                insertStmt.setString(2, email);
                insertStmt.setString(3, phone);
                insertStmt.setString(4, history);
                insertStmt.setString(5, address);
                insertStmt.setString(6, purpose);
                insertStmt.setDouble(7, amount);
                int rowsInserted = insertStmt.executeUpdate();

                if (rowsInserted > 0) {
                    return "New row inserted successfully.";
                } else {
                    return "Error in inserting new row.";
                }
            }
        } catch (Exception e) {
            return "EXCEPTION: " + e;
        }
    }
    public String deleteFundRaiserFromDB(String name){
        String url="jdbc:ucanaccess://FundRaising.accdb";
        String query="DELETE FROM FundRaisers WHERE [Compaign Name] = ?";
        String a="null";
        try {
            Connection con=DriverManager.getConnection(url);
            PreparedStatement delStmt=con.prepareStatement(query);
            delStmt.setString(1, name);
             int rowsDeleted = delStmt.executeUpdate();
            if (rowsDeleted > 0) {
                a="Deleted successfully.";
            } else {
                a="No matching rows found";
            }
            delStmt.close();
            con.close();
        } catch (Exception e) {
            a="Error : "+e;
        }
        return a;
    }
    public String addFRtoDB(String name,String startDate,String endDate,String des,Double amount){
        String a;
        String url="jdbc:ucanaccess://FundRaising.accdb";
                try{
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection con=DriverManager.getConnection(url);
                    Statement st=con.createStatement();
                    String query = "INSERT INTO FundRaisers (`Compaign Name`, `Start Date`, `End Date`, `Target Amount`, `Description`) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement ps=con.prepareStatement(query);
                    ps.setString(1, name);
                    ps.setString(2, startDate);
                    ps.setString(3, endDate);
                    ps.setDouble(4, amount);
                    ps.setString(5, des);
                    int row=ps.executeUpdate();
                    if (row>0) {
                        a="UPDATED SUCCESSFULLY";
                    }
                    else
                        a="ROW DIDNT UPDATED";
                    
                }catch(Exception e){
                    a="EXCEPTION: "+e;
                }
        return a;
    }
    public String updateFieldOfFundRaiser(String name, double amount) {
        String result="";
        String url = "jdbc:ucanaccess://FundRaising.accdb";
        String query = "UPDATE FundRaisers SET [Gathered Amount] = ? WHERE [Compaign Name] = ?";
    
            try (Connection con = DriverManager.getConnection(url);
                PreparedStatement pst = con.prepareStatement(query)) {
        
                pst.setDouble(1, amount);
                pst.setString(2, name);
        
                int rowsUpdated = pst.executeUpdate();
                if (rowsUpdated > 0) {
                    result="Amount updated successfully.";
                }else {
                    result="No rows matching the condition found.";
                }
        
    } catch (Exception e) {
        result="Exception in updating field of FundRaiser: "+e;
    }
            return result;
    }
}
