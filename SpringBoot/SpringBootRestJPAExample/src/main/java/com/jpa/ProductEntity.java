package com.jpa;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//bean class

@Entity
public class ProductEntity {
	//Variable Declaration
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;
   
    
    @Column(length=20)
    private String name;
    @Column(length=50)
    private String description;
    
    
    //Constructor
    public ProductEntity() {
        super();
    }
    public ProductEntity(int id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }
    
    //getter and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }   
}
