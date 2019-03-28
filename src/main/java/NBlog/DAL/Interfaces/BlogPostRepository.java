package NBlog.DAL.Interfaces;

import NBlog.DataModel.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
    BlogPost getByBlogPostId(int id);
}
