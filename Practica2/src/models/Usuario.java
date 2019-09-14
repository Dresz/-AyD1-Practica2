package models;

public class Usuario {

    private String name;
    private int carnet;
    private String password;
    
    public Usuario(){
        this.name="";
        this.carnet=0;
        this.password="";
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
