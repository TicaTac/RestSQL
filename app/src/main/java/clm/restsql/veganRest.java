package clm.restsql;

/**
 * Created by jbt on 7/17/2016.
 */
public class veganRest {

    String restname;
    String address;
    boolean friendly;

    //// CTOR/////
    public veganRest(String restname, String address, boolean friendly) {
        this.restname = restname;
        this.address = address;
        this.friendly = friendly;
    }
///////////////

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

    public Boolean isVegan() {
        return friendly;
    }

    @Override
    public String toString() {
        return restname+" "+address+" Friendly:"+friendly;
    }

    public void setFriendly(Boolean friendly) {
        this.friendly = friendly;
    }
}
