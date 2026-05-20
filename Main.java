import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.ui.CustomerUI;

public class Main {
    public static void main(String[] args) {
        System.out.println("E-Commerce-Application");
        CustomerUI customerUI = new CustomerUI();
        Customer customer = customerUI.displaySignUpForm();
        System.out.println(customer);
    }
}