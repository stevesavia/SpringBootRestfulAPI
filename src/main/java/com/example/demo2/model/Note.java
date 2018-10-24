package com.example.demo2.model;


import javax.persistence.*;
import java.util.Date;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;



@Entity
@Table(name = "notes")
@EntityListeners(AuditingEntityListener.class)
public class Note {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
    
    
    public void setTitle(String title){
    	this.title = title;
    }
    
    public void setContent(String content){
    	this.content = content;
    }
    
    public String getTitle(){
    	return title;
    }
    
    public String getContent(){
    	return content;
    }
}
