import java.lang.*;
public class Start{
    public static void main(String []args)
    {
        Coordinate c1=new Coordinate();
        c1.setLatitude(90);
        c1.setLongitude(10);
        Plane p1=new Plane();
       // p1.setPlaneName("Emirates");
        p1.setPlaneNo(223);
        Time t1=new Time();
        t1.setHour(12);
        t1.setMiniute(43);
        Airport a1=new Airport();
        a1.setAirportName("Dhaka");
        a1.setCountryName("Bangladesh");
        a1.setCoordinate(c1);
        a1.setPlane(p1);
        a1.setTime(t1);
////////
        Coordinate c2=new Coordinate();
        c2.setLatitude(190);
        c2.setLongitude(110);
      /*  Plane p2=new Plane();
        p2.setPlaneName(" Emirates ");
        p1.setPlaneNo(223);*/
        Time t2=new Time();
        t2.setHour(23);
        t2.setMiniute(22);
        Airport a2=new Airport();
        a2.setAirportName("Munich");
        a2.setCountryName("Germany");
        a2.setCoordinate(c2);
        a2.setPlane(p1);
        a2.setTime(t2);
        System.out.println(a1.getPlane().getPlaneNo()+"Leaving From "+a1.getAirportName()+a1.getTime().getHour()+" : "+a1.getTime().getMiniute());
        System.out.println(a2.getPlane().getPlaneNo()+" Arrived  in "+ a1.getAirportName()+" at "+a2.getTime().getHour()+" : "+a1.getTime().getMiniute());



    }
}