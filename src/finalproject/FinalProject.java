package finalproject;
import Gui.Home;

public class FinalProject{
    
    
    public static void main(String[] args) {
        FundraiserManager fm=new FundraiserManager();
     
        Fundraiser fR=new Fundraiser("Storm","Storm in USA", "3/5/2023", "31/05/2023",1500000,0);
        fm.addFundRaiser(fR);
        Fundraiser fR1=new Fundraiser("Earthquake","Eathquake in Israle", "3/5/2023", "12/07/2023",150000,150000);
        fm.addFundRaiser(fR1);
        Home h1=new Home(fm);
        h1.setVisible(true);
    }}
//        FundraiserManager fm=new FundraiserManager();
//        Fundraiser fR=new Fundraiser("Storm","Storm in USA", "3/5/2023", "20/05/2023",1500000,0);
//        fm.addFundRaiser(fR);
//        Fundraiser fR1=new Fundraiser("Earthquake","Eathquake in ISrale", "3/5/2023", "12/07/2023",10,10);
//        fm.addFundRaiser(fR1);
//        FundraiserManager fm=new FundraiserManager();
//        Fundraiser fR=new Fundraiser("Storm","Storm in USA", "3/5/2023", "16/05/2023",1500000,0);
//        fm.addFundRaiser(fR);
//        Fundraiser fR1=new Fundraiser("Earthquake","Eathquake in ISrale", "3/5/2023", "12/07/2023",10,10);
//        fm.addFundRaiser(fR1);
//        Scanner sc=new Scanner(System.in);
//        fm.amountCompleted();
//        fm.datesMatcheD();
//        char choiceAdmin;
//        char ch;
//        do{
//        System.out.println("\t\t\t\t-------->FUND RAISING MANAGEMENT SYSTEM<------");
//        System.out.print("\t\t\t\t1)Admin Section\n\t\t\t\t2)User Section\n\t\t\t\t\tPRESS= ");
//        char choice=sc.next().charAt(0);
//        sc.nextLine();
//        if (choice=='1') {
//            
//            System.out.print("ENTER ADMIN NAME: ");
//            String adminName=sc.nextLine();
//            System.out.print("ENTER ADMIN PASSWORD: ");
//            String adminPass=sc.nextLine();
//            if (adminName.equalsIgnoreCase("Admin") && adminPass.equalsIgnoreCase("admin")) {
//              do{
//                    System.out.println("\n\n1->VIEW LIST OF AVAILABLE FUNDRAISERS");
//                    System.out.println("2->ADD FUND RAISER");
//                    System.out.println("3->DELETE FUND RAISER");
//                    System.out.println("4->VIEW EXPIRED FUND RAISERS");
//                    System.out.println("5->VIEW COMPLETED FUNDRAISERS");
//                    System.out.println("6->ADD DONOR");
//                    System.out.println("7->VIEW DONORS");
//                    System.out.print("8->Exit\nPRESS=>> ");
//                    char choice_1=sc.next().charAt(0);
//                    sc.nextLine();
//                    if (choice_1=='1') {
//                        fm.viewFundRaisers();
//                        sc.nextLine();
//                        }
//                    else if (choice_1=='2') {
////                        sc.nextLine();
//                       System.out.print(">Enter compaign name: ");
//                        String compaign=sc.nextLine();
//                        System.out.print(">Enter Description: ");
//                        String description=sc.nextLine();
//                        System.out.print(">Enter Start Date: ");
//                        String startDate=sc.nextLine();
//                        System.out.print(">Enter End Date: ");
//                        String endDate=sc.nextLine();
//                        System.out.print(">Enter Targeted Amount: ");
//                        double targetAmount=sc.nextDouble();
//                            Fundraiser f=new Fundraiser(compaign,description, startDate, endDate,targetAmount,0);
//                            fm.addFundRaiser(f);
//                            sc.nextLine();
//                        }
//                    else if (choice_1=='3') {
//                        fm.viewFundRaisers();
//                        System.out.print("ENTER COMPAIGN NAME TO DELETE FROM THE LIST:");
//                        String name=sc.next();
//                        fm.deleteFundraiserByName(name);
//                        sc.nextLine();}
//                    else if (choice_1=='4') {
//                        fm.expiredCompaigns();
//                    }
//                    else if (choice_1=='5') {
//                      fm.displayCompletedCompaigns();
//                  }
//                    else if(choice_1=='6'){
//                        System.out.print("ENTER DONAR NAME: ");
//                        String name=sc.nextLine();
//                        System.out.print("ENTER DONOR ADDRESS: ");
//                        String add=sc.nextLine();
//                        System.out.print("ENTER DONATION HISTORY: ");
//                        String dH=sc.nextLine();
//                        System.out.print("ENTER DONOR EMAIL: ");
//                        String email=sc.nextLine();
//                        System.out.print("ENTER DONOR PHONE NO: ");
//                        String phone=sc.nextLine();
//                        Donor donor=new Donor(name, add, email, phone, dH);
//                        System.out.print("ENTER DONATION PURPOSE: ");
//                        String pur=sc.nextLine();
//                        System.out.print("ENTER DONATION AMOUNT: ");
//                        double amount=sc.nextDouble();
//                        Donation donation=new Donation(donor, amount, pur);
//                        fm.addDonor(donation);
//                        sc.nextLine();
//                        }
//                    else if (choice_1=='7') {
//                        fm.displayDonorsforAdmins();
//                    }
//                    else if(choice_1=='8')
//                    {System.out.println("\t\t\tCONFIRM TO EXT");
//                    break;}
//
//                    System.out.print(">>>>>>>WANT TO EXIT ADMIN SECTION(Y/n): ");
//                    choiceAdmin=sc.next().charAt(0);
//                }while(choiceAdmin=='n'||choiceAdmin=='N');
//            }
//            else
//                System.out.println("\t\t\t!!!!!INVALID DETAILS!!!!\n\t\t\t-----xxxx SYSTEM CLOSE xxxx----");
//        }
//        
//            if (choice=='2') {
//                System.out.println("\t\t\t====>USER LOGIN SESSION<====");
//                sc.nextLine();
//                char choiceUser;
//                String name="",email="",phone="",donationH="",address="";
//                do{ 
//                    System.out.print("Enter Your Name: ");
//                    name=sc.nextLine();
//                    System.out.print("ENTER YOUR EMAIL: ");
//                    email=sc.nextLine();
//                    System.out.print("ENTER YOUR PHONE NUMBER: ");
//                    phone=sc.nextLine();
//                    System.out.print("ANY DONATION HISTORY: ");
//                    donationH=sc.nextLine();
//                    System.out.print("ENTER YOUR ADDRESS: ");
//                    address=sc.nextLine();
//                        if (name.isEmpty() && email.isEmpty() && phone.isEmpty() && donationH.isEmpty() && address.isEmpty()) {
//                            System.out.println("\t\t\t**** NO  FIELD  SHOULD  BE  LEFT  EMPTY");
//                        }
//                 } while (name==""&&email==""&&phone==""&&donationH==""&&address=="");
//                Donor donor=new Donor(name, address, email, phone, donationH);
//                do{
//                    System.out.println("\n\n\t\t\t\tUser Section");
//                    System.out.println("1>WANT TO VIEW AVAILABLE FUND RAISING COMPAIGN");
//                    System.out.print("2>DONATE TO AVAILABLE FUND RAISING COMPAIGN\n");
//                    System.out.println("3>VIEW EXPIRED COMPAIGNS");
//                    System.out.println("4>VIEW COMPLETED COMPAIGNS");
//                    System.out.println("5>VIEW YOUR DONATIONS: ");
//                    System.out.print("6>VIEW DONARS OF OUR ORAGANIZATION\nPRESS==>");
//                    char choice_2=sc.next().charAt(0);
//                    if (choice_2=='1') {
//                        fm.viewFundRaisers();
//                    }
//                    else if(choice_2=='2'){
//                        sc.nextLine();
//                        fm.viewFundRaisers();
//                        System.out.print("ENTER COMPAIGN NAME IN WHICH YOU WANT TO DONATE: ");
//                        String cName=sc.nextLine();
//                        double donated=fm.addDonationToFundRaiser(cName);
//                        if (donated>0) {
//                            Donation donation=new Donation(donor,donated,cName);
//                            fm.addDonor(donation);
//                            fm.amountCompleted();
//                        }
//                        else{
//                            System.out.println("\t\t===> ERROR  IN  DONATING  !!! TRY  AGAIN !!!");
//                        }
//                        
//                    }
//                    else if (choice_2=='3') {
//                        fm.expiredCompaigns();
//                    }
//                    else if (choice_2=='4') {
//                        fm.displayCompletedCompaigns();
//                    }
//                    else if (choice_2=='5') {
//                        fm.displayMyDonations(name);
//                    }
//                    else if(choice_2=='6'){
//                        fm.displayDonorsForUsers();
//                    }
//                        System.out.print("Want To Exit User Section: ");
//                        choiceUser=sc.next().charAt(0);
//                }while(choiceUser=='n'||choiceUser=='N');
//            }
//            System.out.print("Continue towards the MAIN MENU: ");
//            ch=sc.next().charAt(0);
//        }while(ch=='y'||ch=='Y');
//    }
//}
