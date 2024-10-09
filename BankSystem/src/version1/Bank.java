package version1;

import java.util.ArrayList;


public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    TextUI ui = new TextUI();

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }
    public void addCustomer(Customer c){
        this.customers.add(c);
    }
    public String toString(){
        String s = "";
        for (Customer c:customers) {
            s+=c+"\n";
        }
        return s;
    }

    public ArrayList<Customer> getCustomers() {

        return customers;

    }

    public void runCreateCustomersDialog() {

        String continueDialog = "Y";
        while(continueDialog.equalsIgnoreCase("Y")) {
            String nameInput = ui.promptText("Type name of customer");
            int startAmount = ui.promptNumeric("Insert cash amount");
            Customer customerOne = new Customer(nameInput, startAmount);
            continueDialog = ui.promptText("Do you wish to create another customer? Y/N");

        }


    }

}
