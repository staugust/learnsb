package cn.augusto.expl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Controller
public class ExplApp {

  @RequestMapping("/")
  public String index(Model model){
    Person single = new Person("aa", 11);
    List<Person> people = new ArrayList<Person>();
    Person p1 = new Person("xx", 22);
    Person p2 = new Person("yy", 33);
    Person p3 = new Person("zz", 44);
    people.add(p1);
    people.add(p2);
    people.add(p3);

    model.addAttribute("people", people);
    model.addAttribute("singlePerson", single);
    return "index";
  }

  public static void main(String[] args){
    SpringApplication.run(ExplApp.class, args);
  }
}
