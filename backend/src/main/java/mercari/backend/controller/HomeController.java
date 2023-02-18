package mercari.backend.controller;

import mercari.backend.repository.MainPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public MainPage mainPage() {

        MainPage mainPage = new MainPage();
        mainPage.setId(1);
        mainPage.setPrice(1500);
        mainPage.setTitle("MACBOOK M1 PRO 2021 14インチです！！");

        return mainPage;
    }
}
