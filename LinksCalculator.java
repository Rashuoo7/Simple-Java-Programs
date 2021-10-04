import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.io.IOException;
public class LinksCalculator {
    
    public static int getTotalLinks() throws IOException {
        System.out.println("Getting the url http://itihaa.co.in ...");
        Document doc = Jsoup.connect("http://itihaa.co.in").get(); //Getting and Saving the html document in Document type variable doc.
        Elements allLinks = doc.select("a[href]"); //Selecting all elements with a tag and href attribute and saving in an Elements type ArrayList allLinks. 
        return allLinks.size(); //returning total links
        }
        
    public static void printTotalLinks() throws IOException{
        System.out.println("Total number of Links on the page are: " + getTotalLinks());
    }
}
