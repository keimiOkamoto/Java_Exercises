
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Set;

public class SpamBotImpl implements SpamBot {
    ConnectionManager connectionManager = new ConnectionManager();
    String seedUrl;
    URL aUrl;
    Set<String> emailList;
    File aFile;

    public SpamBotImpl(String seedUrl) {
        this.seedUrl = seedUrl;
        emailList = new HashSet<String>();

        try {
            aUrl = new URL(seedUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setSeed(String seedUrl) throws MalformedURLException {
        try {
            aUrl = new URL(seedUrl);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void setThreads(int count) {
        while (count > 0) {
            Thread aThread = new Thread();
            count--;
            aThread.start();
        }
    }

    @Override
    public void scanSite() {
        dataExtractor();
    }

    @Override
    public Set<String> getEMails() {
        return null;
    }

    public void dataExtractor() {
        String appendedStringofHTMLData = " ";
        try {
            URLConnection yc = aUrl.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null)
                appendedStringofHTMLData += inputLine;
            System.out.println(appendedStringofHTMLData);

        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        fileWriter(appendedStringofHTMLData);
    }

    public void fileWriter(String htmlString) {
        File htmlFile = new File("oracle.html");
        try {
            FileWriter newFileWriter = new FileWriter(htmlFile, true);
            newFileWriter.append(htmlString);

        } catch (FileNotFoundException fileNotFoundException) {

            fileNotFoundException.printStackTrace();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String getSeed() {
        return seedUrl;
    }
}
