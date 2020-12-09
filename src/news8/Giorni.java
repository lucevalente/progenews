package news8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Giorni {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today " + today);
		System.out.println("Today getdayofweek " + today.getDayOfWeek());

		LocalDate ferragosto = LocalDate.of(2020, 8, 15);
		System.out.println("Ferragosto getdayofweek " + ferragosto.getDayOfWeek());

		LocalTime nowLocalDate = LocalTime.now(); // ora di quando lancio il programma
		LocalTime nowLocalDate1 = LocalTime.of(13, 44); // non ho capito
		System.out.println("nowLocalDate " + nowLocalDate);
		System.out.println("Today gethour " + nowLocalDate.getHour()); // l'ora di oggi

		LocalDateTime todaydatetime = LocalDateTime.now();
		System.out.println("Today datetime " + todaydatetime); // data e ora precisi
		System.out.println("Today getmonth " + todaydatetime.getMonth()); // mese di oggi
		System.out.println("Today getmonthvalue " + todaydatetime.getMonthValue()); // numero del mese di oggi

		LocalDateTime complete = LocalDateTime.of(ferragosto, nowLocalDate1);
		System.out.println("Complete " + complete); // si legge di merda
		LocalDateTime complete1 = LocalDateTime.of(2020, 8, 15, 13, 13, 14); // va inserito a mano ed è scomodo

		LocalDateTime complete21 = LocalDateTime.parse("2020-03-08T13:13:14"); // non ho capito
		System.out.println("Complete21 con parse " + complete21);

		LocalDateTime complete22 = complete21.plusSeconds(3600); // aggiunge 1 ora
		System.out.println("Complete22 plusseconds " + complete22);

		LocalDateTime complete23 = complete21.plusDays(360); // aggiunge 1 anno
		System.out.println("Complete21 plusday " + complete23);

	}

}
