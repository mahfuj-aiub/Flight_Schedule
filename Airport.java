
import java.lang.*;
class Airport{
    private String airportName;
    private String countryName;
    private Coordinate co;
    private Plane pl;
    private Time t;
    
    Airport(){

    }
    public void setAirportName(String airportName){
        this.airportName=airportName;
    }
    public void setCountryName(String countryName){
        this.countryName=countryName;
    }
    public void setCoordinate(Coordinate co){
        this.co=co;
    }
    public void setTime(Time t)
    {
        this.t=t;
    }
    public void setPlane(Plane pl){
        this.pl=pl;
    }
    public String getAirportName(){
        return airportName;
    }
    public String getCountryName(){
        return countryName;
    }
    public Coordinate getCoordinate(){
        return co;
    }
    public Plane getPlane(){
        return pl;
    }
    public Time getTime(){
        return t;
    }
}