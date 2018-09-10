package lt.baltictalents.namuDarbaiBeMareko.regeksas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//**Duota /demo/19/automobilis?id=140
//Pasitikrinimui pasinaudokite https://regex101.com/
//1. rasti tekstą nuo pradžios iki ? (/demo/19/automobilis)
//2. raskite tekstą nuo ? iki galo (id=140)
//3. raskite tekstą iki antro / (/demo)
//4. raskite tekstą tarp paskutinio / ir ? (automobilis)**//"(/a?.*//?)(\\D)(.*)()";
public class Regeksas {
        public static void main( String args[] ) {
            // String to be scanned to find the pattern.
            String line = "/demo/19/automobilis?id=140";
            String pattern = "(/a?.*/)(\\D.*)(.*)(.)";

            // Create a Pattern object
            Pattern r = Pattern.compile(pattern);

            // Now create matcher object.
            Matcher m = r.matcher(line);
            if (m.find( )) {
                System.out.println("Found value: " + m.group(0) );
                System.out.println("Found value: " + m.group(1) );
                System.out.println("Found value: " + m.group(2) );
                System.out.println("Found value: " + m.group(3) );
            }else {
                System.out.println("NO MATCH");
            }
        }
    }

