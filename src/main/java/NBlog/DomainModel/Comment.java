package NBlog.DomainModel;

import java.util.List;

public class Comment {
    public long commentId;
    public String content;
    public List<Comment> childComments;
}
