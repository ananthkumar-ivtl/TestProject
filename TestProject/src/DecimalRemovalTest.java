import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.apache.log4j.Logger;

public class DecimalRemovalTest {
	
	 static Logger log = Logger.getLogger(DecimalRemovalTest.class.getName());
	
	public static void main(String[] args) throws FileNotFoundException {
		
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("D:/console.txt")), true));
		BigDecimal answer = new BigDecimal(11245.00000010);
		log.info("test");
		System.out.println(answer.toBigInteger());
		Object answer1 = 11245.0000001012;
		DecimalFormat df = new DecimalFormat("#.###############");
		System.out.println(df.format(answer1));
	}
}
