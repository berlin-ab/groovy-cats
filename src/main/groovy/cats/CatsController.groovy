package cats
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class CatsController {

    @Autowired
    CatsRepository repository

    @RequestMapping('/cats/index')
    def String index(Model model){
        println "I'm Here"
        return "cats"
    }

}
