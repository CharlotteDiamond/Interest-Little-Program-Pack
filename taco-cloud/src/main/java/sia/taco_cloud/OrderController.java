package sia.taco_cloud;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;
import sia.taco_cloud.Order;
@Slf4j
@Controller
@RequestMapping("/order")
public class OrderController {
    @GetMapping("/current")
    public String current(Model model) {
        model.addAttribute("order",new Order());
        return "orderForm";
    }
}
