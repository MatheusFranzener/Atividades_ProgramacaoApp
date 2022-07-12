import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class atv_02 {

	public static void main(String[] args) {

		DateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

	}
}