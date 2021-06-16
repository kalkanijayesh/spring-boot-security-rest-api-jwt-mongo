package spring.mongorestapijwtauth.demo.entities;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

//Using this lombok annotation do not required to implement consutrcuter and getter/setter method with @Data annotation.
@Data
@Document
public class AppUser {

    @Id
    private String id;
    @Indexed(unique = true)
    private String uname;
    private boolean is_active;
    private int fav_number;
    private Gender gender;
    private List<String> hobbies;
    private LocalDateTime localDateTime;

    public AppUser() {
    }

    public AppUser(String user_full_name, boolean is_active, int fav_number, Gender gender, List<String> hobbies,
            LocalDateTime localDateTime) {
        this.uname = user_full_name;
        this.is_active = is_active;
        this.fav_number = fav_number;
        this.gender = gender;
        this.hobbies = hobbies;
        this.localDateTime = localDateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public int getFav_number() {
        return fav_number;
    }

    public void setFav_number(int fav_number) {
        this.fav_number = fav_number;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    

    /*
     * 
     * public User(String user_full_name, String[] hobbie, boolean is_active, int
     * fav_number, Gender gender, List<String> hobbies, ZonedDateTime zonedDateTime)
     * { this.user_full_name = user_full_name; this.hobbie = hobbie; this.is_active
     * = is_active; this.fav_number = fav_number; this.gender = gender; this.hobbies
     * = hobbies; this.zonedDateTime = zonedDateTime; } public String
     * getUser_full_name() { return user_full_name; } public void
     * setUser_full_name(String user_full_name) { this.user_full_name =
     * user_full_name; } public String[] getHobbie() { return hobbie; } public void
     * setHobbie(String[] hobbie) { this.hobbie = hobbie; } public boolean
     * isIs_active() { return is_active; } public void setIs_active(boolean
     * is_active) { this.is_active = is_active; } public int getFav_number() {
     * return fav_number; } public void setFav_number(int fav_number) {
     * this.fav_number = fav_number; } public Gender getGender() { return gender; }
     * public void setGender(Gender gender) { this.gender = gender; } public
     * List<String> getHobbies() { return hobbies; } public void
     * setHobbies(List<String> hobbies) { this.hobbies = hobbies; } public
     * ZonedDateTime getZonedDateTime() { return zonedDateTime; } public void
     * setZonedDateTime(ZonedDateTime zonedDateTime) { this.zonedDateTime =
     * zonedDateTime; }
     */

}
