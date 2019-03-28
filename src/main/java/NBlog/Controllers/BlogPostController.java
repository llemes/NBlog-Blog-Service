package NBlog.Controllers;

import NBlog.BLL.BlogPostBLL;
import NBlog.DomainModel.BlogPost;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogPostController {

    private BlogPostBLL blogPostBLL = new BlogPostBLL();

    @RequestMapping("/blog/get")
    public BlogPost getBlogPost(@RequestParam(value="id")int id) {
        return new BlogPost();
    }
}
