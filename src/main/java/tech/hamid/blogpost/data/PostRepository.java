package tech.hamid.blogpost.data;

import org.springframework.stereotype.Component;
import tech.hamid.blogpost.model.Post;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class PostRepository {
    private final List<Post> ALL_POSTS = new ArrayList<>(Arrays.asList(
            new Post(1l, "HTML 5",
                    "its the Skeleton of a website.",
                    "HTML (Hypertext Markup Language) is the code that is used to structure a web page and its content. For example, content could be structured within a set of paragraphs, a list of bulleted points, or using images and data tables. As the title suggests, this article will give you a basic understanding of HTML and its functions.",
                    "Siddiquah Anjum", new Date()),

            new Post(2l, "CSS 3",
                    "its the design and creative part of the website",
                    "The CSS interface holds useful CSS-related methods. No objects with this interface are implemented: it contains only static methods and is therefore a utilitarian interface.",
                    "Siddiquah Anjum", new Date()),

            new Post(3l, "JAVA",
                    "Java is a general purpose, high-level programming language first released by Sun Microsystems in 1995.",
                    "Java is a widely used programming language expressly designed for use in the distributed environment of the internet. It is the most popular programming language for Android smartphone applications and is also among the most favored for the development of edge devices and the internet of things.",
                    "Siddiquah Anjum", new Date()),

            new Post(3l, "JAVA",
                    "JavaScript is a scripting language that enables you to create dynamically updating content",
                    "JavaScript is a scripting or programming language that allows you to implement complex features on web pages — every time a web page does more than just sit there and display static information for you to look at — displaying timely content updates, interactive maps, animated 2D/3D graphics, scrolling video jukeboxes, etc. — you can bet that JavaScript is probably involved. It is the third layer of the layer cake of standard web technologies, two of which (HTML and CSS) we have covered in much more detail in other parts of the Learning Area.",
                    "Siddiquah Anjum", new Date())

    ));


    public List<Post> getAllPosts() {
        return ALL_POSTS;
    }

    public Post findById(Long id) {
        for (Post post : ALL_POSTS)
            if (post.getId() == id)
                return post;
        return null;
    }
}
