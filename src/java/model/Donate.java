
package model;

public class Donate {
    String Category;
    String Pname;
    String Pdesc;
    String usage;
    String email;
    int new_points;
    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
    
   public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = Pname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPdesc() {
        return Pdesc;
    }

    public void setPdesc(String Pdesc) {
        this.Pdesc = Pdesc;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public int getNew_points() {
        return new_points;
    }

    public void setNew_points(int new_points) {
        this.new_points = new_points;
    }

    
    
}


