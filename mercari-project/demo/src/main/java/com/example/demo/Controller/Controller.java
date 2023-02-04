package com.example.demo.Controller;

//import com.example.demo.DataDao;
//import ch.qos.logback.core.model.Model;
import org.springframework.ui.Model;
//import com.example.demo.bean.Modelbean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {
    /*
    //DAO作成時に実行するコード
    private final DataDao dataDao;

    @Autowired
    public DataController(DataDao dataDao) {
        this.dataDao = dataDao;
    }



       //@GetMappingを使って
       // JSON形式でデータを返すエンドポイントを定義
       @GetMapping("/user")
       public Modelbean getUser() {


           return new Modelbean("ジョン・ドウ", 30);

       }
       */

    @GetMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("data", "hello!!");
        model.addAttribute("name", "philip");
        return "hello";
    }


        /*
        List<Data> dataList = dataDao.getData();
        ObjectMapper mapper = new ObjectMapper();
        String jsonData = mapper.writeValueAsString(dataList);
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(jsonData, headers);
        restTemplate.postForEntity("https://example.com/api/data", entity, String.class);

         */

}
