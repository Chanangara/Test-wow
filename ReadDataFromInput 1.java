import java.io.*;
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.time.LocalDate;
import java.time.LocalTime;

public class ReadDataFromInput {
   public static void main (String[] args) {
      String currentTime;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      try {
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
         
         LocalTime time = LocalTime.now();
         System.out.println("Current time: " + dtf.format(time));

         printTime(dtf.format(time));
      } catch (Exception e) {
         System.out.println(e);
      }
   }
   
   static void printTime(String time){
       String[] s = time.split(":");
       String hours[] = { "zero", "one", "two", "three", "four",
                            "five", "six", "seven", "eight", "nine",
                            "ten", "eleven", "twelve", "thirteen",
                            "fourteen", "fifteen", "sixteen", "seventeen",
                            "eighteen", "nineteen", "twenty", "twenty one",
                            "twenty two", "twenty three"
                        };
       String minutes[] = { "zero", "one", "two", "three", "four",
                            "five", "six", "seven", "eight", "nine",
                            "ten", "eleven", "twelve", "thirteen",
                            "fourteen", "fifteen", "sixteen", "seventeen",
                            "eighteen", "nineteen", "twenty", "twenty one",
                            "twenty two", "twenty three", "twenty four","twenty five",
                            "twenty six","twenty seven","twenty eight","twenty nine",
                            "thirty","thirty one","thirty two","thirty three",
                            "thirty four","thirty five","thirty six","thirty seven",
                            "thirty eight","thirty nine","forty","forty one","forty two",
                            "forty three","forty four","forty five","forty six","forty seven",
                            "forty eight","forty nine","fifty","fifty one","fifty two",
                            "fifty three","fifty four","fifty five","fifty six","fifty seven",
                            "fifty eight","fifty nine"
                       };
       if(time.equals("00:00")){
           System.out.println("It's Midnight");
       } else if(time.equals("12:00")){
           System.out.println("It's Midday");
       } else if(s[1].equals("00")){
           System.out.println("It's " + hours[Integer.parseInt(s[0])] + " 'o clock");
       } else {
        System.out.println("It's " + hours[Integer.parseInt(s[0])] + " " + minutes[Integer.parseInt(s[1])]);
       }
   }
}