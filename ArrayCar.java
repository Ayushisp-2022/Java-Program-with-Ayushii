
import java.util.*;
public class ArrayCar {

public enum Cars {ferari, maruti, omni};

public static void main(String [ ] args) {

Cars mycar = Cars.ferari;

switch (mycar) {

case ferari:

System.out.print("ferari ");
break;
case maruti:

System.out.print("maruti ");
break;
default :

System.out.print("mercedez ");
}

}

}