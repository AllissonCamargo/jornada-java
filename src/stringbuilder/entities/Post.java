package stringbuilder.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String tittle;
    private String content;
    private int likes;

    private List<Comment> comments = new ArrayList<>();

    public Post(){

    }

    public Post(Date moment, String tittle, String content, int likes) {
        this.moment = moment;
        this.tittle = tittle;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }


    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(tittle).append("\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(simpleDateFormat.format(moment)).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments: \n");
        for (Comment c : comments){
            if (c != null){
                sb.append(c.getText()).append("\n");
            }
        }

        return sb.toString();
    }

}
