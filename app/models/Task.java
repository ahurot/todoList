package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Task extends Model {
 
    public String title;
    public Date postedAt;
    @Lob
    public String content;
    @ManyToOne
    public User author;
    
    public Task(User author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.postedAt = new Date();
    }
 
}