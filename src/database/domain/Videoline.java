package database.domain;
// Generated 29.04.2016 17:03:11 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Videoline generated by hbm2java
 */
public class Videoline  implements java.io.Serializable {


     private Integer id;
     private String fileName;
     private int fileSize;
     private String fileFormat;
     private int videoBitrate;
     private String videoBitrateMode;
     private int duration;
     private String aspectRatio;
     private int resolutionWidth;
     private int resolutionHeight;
     private double framerate;
     private Set movies = new HashSet(0);

    public Videoline() {
    }

	
    public Videoline(String fileName, int fileSize, String fileFormat, int videoBitrate, String videoBitrateMode, int duration, String aspectRatio, int resolutionWidth, int resolutionHeight, double framerate) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;
        this.videoBitrate = videoBitrate;
        this.videoBitrateMode = videoBitrateMode;
        this.duration = duration;
        this.aspectRatio = aspectRatio;
        this.resolutionWidth = resolutionWidth;
        this.resolutionHeight = resolutionHeight;
        this.framerate = framerate;
    }
    public Videoline(String fileName, int fileSize, String fileFormat, int videoBitrate, String videoBitrateMode, int duration, String aspectRatio, int resolutionWidth, int resolutionHeight, double framerate, Set movies) {
       this.fileName = fileName;
       this.fileSize = fileSize;
       this.fileFormat = fileFormat;
       this.videoBitrate = videoBitrate;
       this.videoBitrateMode = videoBitrateMode;
       this.duration = duration;
       this.aspectRatio = aspectRatio;
       this.resolutionWidth = resolutionWidth;
       this.resolutionHeight = resolutionHeight;
       this.framerate = framerate;
       this.movies = movies;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public int getFileSize() {
        return this.fileSize;
    }
    
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }
    
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }
    public int getVideoBitrate() {
        return this.videoBitrate;
    }
    
    public void setVideoBitrate(int videoBitrate) {
        this.videoBitrate = videoBitrate;
    }
    public String getVideoBitrateMode() {
        return this.videoBitrateMode;
    }
    
    public void setVideoBitrateMode(String videoBitrateMode) {
        this.videoBitrateMode = videoBitrateMode;
    }
    public int getDuration() {
        return this.duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getAspectRatio() {
        return this.aspectRatio;
    }
    
    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }
    public int getResolutionWidth() {
        return this.resolutionWidth;
    }
    
    public void setResolutionWidth(int resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
    }
    public int getResolutionHeight() {
        return this.resolutionHeight;
    }
    
    public void setResolutionHeight(int resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
    }
    public double getFramerate() {
        return this.framerate;
    }
    
    public void setFramerate(double framerate) {
        this.framerate = framerate;
    }
    public Set getMovies() {
        return this.movies;
    }
    
    public void setMovies(Set movies) {
        this.movies = movies;
    }




}

