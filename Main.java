import com.stschool.ecommerce.exception.CustomerExistsException;
import com.stschool.ecommerce.exception.CustomerNotFoundException;
import com.stschool.ecommerce.exception.InvalidCredentialsException;
import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.ui.CustomerUI;


public class Main {
    public static void main(String[] args) {

        System.out.println("E-Commerce Application");
       /* CsvReader csvReader = new CsvReader();
        CustomerRepository customerRepository = new CustomerRepository(csvReader);
        System.out.println(customerRepository.getCustomers());*/

        CustomerUI customerUI = new CustomerUI();
       /* try {
            Customer registeredCustomer = customerUI.registerCustomer();
            if(registeredCustomer != null)
                System.out.println("Customer registered successfully");

        } catch (CustomerExistsException e) {
            System.out.println("Registration Failed:");
            System.out.println(e.getMessage());

        }*/
        try{
            Customer existingCustomer =  customerUI.loginCustomer();
            if(existingCustomer != null)
                System.out.println("Login Successful, Welcome: " + existingCustomer.getName() );
        } catch(CustomerNotFoundException | InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }
    }
}