package aplikasiRestoran.kelompok6.apps.entity;

import java.util.Objects;

public class Login {
    
    //konsep Object Relation Model (ORM)
    //Deklarasi seluruh field sebagai atribut
    private String username;
    private String password;
    private final String us = "Admin";
    private final String ps = "admin123";
    
    //Getter Setter 

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
//Buat Enkripsi Password
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.username);
        hash = 47 * hash + Objects.hashCode(this.password);
        hash = 47 * hash + Objects.hashCode(this.us);
        hash = 47 * hash + Objects.hashCode(this.ps);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Login other = (Login) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.us, other.us)) {
            return false;
        }
        if (!Objects.equals(this.ps, other.ps)) {
            return false;
        }
        return true;
    }
    
    public Login(){
        
    }
    public Login(String username, String password, String us, String ps){
        this.username = username;
        this.password = password;
        
    }
    
}
