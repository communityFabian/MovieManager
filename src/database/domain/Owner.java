package database.domain;
// Generated 30.04.2016 21:37:04 by Hibernate Tools 4.3.1



/**
 * Owner generated by hbm2java
 */
public class Owner  implements java.io.Serializable {


     private Integer id;
     private Movie movie;
     private Ownerpos ownerpos;
     private String hdd;

    public Owner() {
    }

    public Owner(Movie movie, Ownerpos ownerpos, String hdd) {
       this.movie = movie;
       this.ownerpos = ownerpos;
       this.hdd = hdd;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Movie getMovie() {
        return this.movie;
    }
    
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    public Ownerpos getOwnerpos() {
        return this.ownerpos;
    }
    
    public void setOwnerpos(Ownerpos ownerpos) {
        this.ownerpos = ownerpos;
    }
    public String getHdd() {
        return this.hdd;
    }
    
    public void setHdd(String hdd) {
        this.hdd = hdd;
    }




}


