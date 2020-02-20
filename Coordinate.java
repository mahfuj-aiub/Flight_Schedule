
import java.lang.*;
public class Coordinate{
    private int longitutde;
    private int latitude;
    Coordinate(){

    }
    public void setLongitude(int longitutde){
        this.longitutde=longitutde;
    }
    public void setLatitude(int latitude){
        this.latitude=latitude;
    }
    public int getLongitude(){
        return longitutde;
    }
    public int getLatitude(){
        return latitude;
    }
}