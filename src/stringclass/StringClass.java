package stringclass;

/**
 *
 * @author   Maven Scientists (http://blog.mavenscientists.com) 
 * @time     Aug 18, 2013 6:44:56 AM 
 */
public class StringClass {

    public static void main(String[] args) {
        
        String str = "Hello World";
        System.out.println( str.charAt(2) );
        System.out.println( str.concat("!!") );
        System.out.println( "The String str contains the word \"World\" : " + str.contains("World") );
        System.out.println( str.contentEquals("Hello World"));
        System.out.println( str.endsWith("rld"));
        System.out.println( str.equals("Hello World"));
        System.out.println( str.equalsIgnoreCase("hello world"));
        System.out.println( str.indexOf('W'));
        System.out.println( str.indexOf("World"));
        // finding second occurence of 'o' in string
        System.out.println( str.indexOf("o", str.indexOf("o") + 1 )); 
        System.out.println( str.lastIndexOf("o"));
        System.out.println( str.length());
        System.out.println( str.replace("Hello", "hello"));
        System.out.println( str.toLowerCase());
        System.out.println( str.toUpperCase());
        System.out.println( str.trim());
        
        char[] c = str.toCharArray();
        System.out.println( c );

    }

}
