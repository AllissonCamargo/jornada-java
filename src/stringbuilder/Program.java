package stringbuilder;

import stringbuilder.entities.Comment;
import stringbuilder.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow! Thats awesome!");

        Post p1 = new Post(simpleDateFormat.parse(
                "21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderfull country!", 12);


        p1.addComment(c1);
        p1.addComment(c2);


        Comment c3 = new Comment("Good night!");
        Comment c4 = new Comment("May the force be with you.");

        Post p2 = new Post(simpleDateFormat.parse(
                "28/07/2018 23:14:19"),
                "Good night",
                "See you tomorrow", 15);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
    }
}
