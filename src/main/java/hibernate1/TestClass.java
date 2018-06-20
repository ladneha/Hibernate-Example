package hibernate1;

import java.util.Scanner;

public class TestClass {
   public static void getUserMenu() {
	   System.out.println("**********************");
	   System.out.println("Save) Save Module");
	   System.out.println("Load) Load Module");
	   System.out.println("Remove) Remove Module");
	   System.out.println("Update) Update Module");
	   System.out.println("**********************");
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter User choice:");
	   String choice = sc.next();
	   CustomerD icustomer = new CustomerDImpl();
	   switch(choice) {
	   case "Save":
		   Customer customer = new Customer();
		   customer.setCustomerId(104);
		   customer.setCustomerCity("Kolhapur");
		   customer.setCustomerName("Neha");
		   icustomer.saveCustomer(customer);
		   
		   break;
	   case "Load":
		   System.out.println("Load Customer Id: ");
		   int id = sc.nextInt();
		   icustomer.getCustomer(id);
		   break;
	   case "Remove":
		   System.out.println("Enter Customer Id to remove:");
		   int Id = sc.nextInt();
		   Customer customer2 = new Customer();
		   customer2 = icustomer.getCustomer(Id);
		   icustomer.removeCustomer(customer2);
		   
		   break;
	   case "Update":
		   Customer customer1 = new Customer();
		   customer1.setCustomerId(101);
		   customer1.setCustomerCity("Kolhapur");
		   customer1.setCustomerName("Neha Lad");
		   icustomer.updateCustomer(customer1);
		   break;
	    default:
	    	System.out.println("Enter correct choice");
	    	System.exit(0);
	   }
	   sc.close();
   }
   
   public static void main(String[] args) {
	   getUserMenu();
   }
}
