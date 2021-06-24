package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("JP Morgan");

        if(bank.addBranch("Chicago")) {
            System.out.println("Chicago branch created");
        }

        bank.addBranch("Chicago");

        bank.addCustomer("Chicago", "Romano", 100.50);
        bank.addCustomer("Chicago", "Ryan", 30.70);
        bank.addCustomer("Chicago", "Bry", 45.80);

        bank.addBranch("Houston");
        bank.addCustomer("Houston", "Tim", 76.25);

        bank.addCustomerTransaction("Chicago", "Romano", 81.15);
        bank.addCustomerTransaction("Chicago", "Romano", 12.55);
        bank.addCustomerTransaction("Chicago", "Ryan", 40.32);

        bank.listCustomers("Chicago", true);
        bank.listCustomers("Houston", true);

        if(!bank.addCustomer("Plano", "Megan", 14.13)) {
            System.out.println("Error Plano branch does not exist");
        }

        if(!bank.addBranch("Chicago")) {
            System.out.println("Chicago branch already exists");
        }

        if(!bank.addCustomerTransaction("Chicago", "Fergus", 52.33)) {
            System.out.println("Customer doesn't exist");
        }

        if(!bank.addCustomer("Chicago", "Romano", 12.21)) {
            System.out.println("Customer Romano already exists");
        }
    }
}
























