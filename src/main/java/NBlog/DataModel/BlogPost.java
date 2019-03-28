package NBlog.DataModel;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "blogpost")
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long blogPostId;

    @Column(columnDefinition = "title")
    private String title;

    @Column(columnDefinition = "content")
    private String content;

    @Column(columnDefinition = "imagecontent")
    private String imageContent;

    @Column(columnDefinition = "creationtimestamp")
    private Date creationTimestamp;

    @Column(columnDefinition = "updatetimestamp")
    private Date updateTimestamp;

    @Column(columnDefinition = "isdeleted")
    private int isDeleted;

    protected BlogPost(long blogPostId, String title, String content, String imageContent, Date creationTimestamp, Date updateTimestamp, int isDeleted) {
        this.blogPostId = blogPostId;
        this.title = title;
        this.content = content;
        this.imageContent = imageContent;
        this.creationTimestamp = creationTimestamp;
        this.updateTimestamp = updateTimestamp;
        this.isDeleted = isDeleted;
    }
}
