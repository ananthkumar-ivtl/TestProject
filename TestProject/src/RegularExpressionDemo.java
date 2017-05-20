import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
	 public static void main( String args[] ) {
	      // String to be scanned to find the pattern.
	      String line = "com.worksap.hue.hr.dto";
	      line.split(".");
	     line = line.replace(".", ",");
	    System.out.println(line);
	    
        String sentence = "Define, Measure, Analyze. Design and Verify";

        String replaced = sentence.replace(".", ",");
        System.out.println(replaced);

	      Pattern patern = Pattern.compile("\\W+");
	      System.out.println(!patern.matcher(line).matches());
	      
	      
	      Pattern intsOnly = Pattern.compile("\\d+");
	      Matcher makeMatch = intsOnly.matcher("dadsad 14 dssaf 12 jfdkasl;fj");
	      makeMatch.find();
	      String inputInt = makeMatch.group();
	      System.out.println(inputInt);
	      
	   }
}
