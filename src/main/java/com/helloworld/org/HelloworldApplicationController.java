import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

  @GetMapping("/")
  public String home() {
    logger.info("Страница домашней страницы открыта");
    // Остальная логика метода
    return "home";
  }
}