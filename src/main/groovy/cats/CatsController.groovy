package cats

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class CatsController {

    @Autowired
    CatsRepository repository

    @RequestMapping('/cats/index')
    def index(Model model){
        def cats = repository.findAll()
        model.addAttribute("values", cats)
        "cats"
    }

}
