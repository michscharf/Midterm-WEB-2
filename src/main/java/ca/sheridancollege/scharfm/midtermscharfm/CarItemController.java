package ca.sheridancollege.scharfm.midtermscharfm;

import ca.sheridancollege.scharfm.midtermscharfm.CarItem;
import ca.sheridancollege.scharfm.midtermscharfm.CarItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarItemController {

    @Autowired
    private CarItemService carItemService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("carItems", carItemService.getAllCarItems());
        return "index";
    }

    @PostMapping("/add")
    public String addCarItem(CarItem carItem) {
        carItemService.addCarItem(carItem);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteCarItem(Long id) {
        carItemService.deleteCarItem(id);
        return "redirect:/";
    }
}