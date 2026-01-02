package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataHoraAgora {
	
	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2025-12-27");
		LocalDateTime d05 = LocalDateTime.parse("2025-12-27T01:30:26");
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
	}

}
