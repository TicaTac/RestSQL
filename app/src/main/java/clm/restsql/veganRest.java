package clm.restsql;

/**
 * Created by jbt on 7/17/2016.
 */
public class veganRest {

    String restname;
    String address;
    boolean friendly;
    int Pic;

//// CTOR/////
    public veganRest(String restname, String address, boolean friendly, int pic) {
        this.restname = restname;
        this.address = address;
        this.friendly = friendly;
        Pic = pic;
    }
///////////////

    public int getPic() {
        return Pic;
    }

    public void setPic(int pic) {
        Pic = pic;
    }

    public String getRestname() {

        return restname;
    }

    public void setRestname(String restname) {
        this.restname = restname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getFriendly() {
        return friendly;
    }

    public void setFriendly(Boolean friendly) {
        this.friendly = friendly;
    }
}
