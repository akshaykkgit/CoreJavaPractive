package akshay.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class LocalDateTimeExample {
	
	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		 System.out.println("Current DateTime="+today);
		 
		   //Current Date using LocalDate and LocalTime
	        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
	        System.out.println("Current DateTime="+today);
	        LocalDateTime specificDate = LocalDateTime.of(2014, Month.JANUARY, 2, 13, 30);
	        System.out.println("Specific Date="+specificDate);
	        
	        
	        //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
	        LocalDateTime todayKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
	        System.out.println("Current Date in IST="+todayKolkata);
	        
	        //Getting date from the base date i.e 01/01/1970
	        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(100000, 0, ZoneOffset.UTC);
	        System.out.println("10000th second time from 01/01/1970= "+dateFromBase);
	 
	}

}
