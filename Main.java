import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;
import com.stschool.ecommerce.ui.CustomerUI;
import com.stschool.ecommerce.util.CsvReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("E-Commerce-Application");

        /*CustomerUI customerUI = new CustomerUI();
        Customer customer = customerUI.displaySignUpForm();
        System.out.println(customer);*/
        CsvReader csvReader = new CsvReader();
        CustomerRepository customerRepository = new CustomerRepository(csvReader);
        System.out.println(customerRepository.getCustomers());
    }
}