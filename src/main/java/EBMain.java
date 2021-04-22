import java.io.*;
import java.util.HashSet;


public class EBMain {
    public static void main(String[] args) throws IOException {
        HashSet<String> ch = new HashSet<String>();
        CateReset.cateReset("123>456>789","abc>def>hij",ch);
        CateReset.cateReset("123>456>789>456","abc>def>hij>???",ch);
        CateReset.cateReset("123>456>54646757","abc>def>yyy",ch);
        /*String readPath = "/home/bright/Documents/eBayScrapy/Info.tsv";
        String writePath = "/home/bright/Documents/eBayScrapy/EnhancedInfo.tsv";
        String appId = "JialingH-Emacoder-PRD-dcbc14c02-0e31668f";
        //System.out.println(GetPathCode.getPathCode(appId,"181148"));
        try{
            File reader = new File(readPath);
            File writer = new File(writePath);
            BufferedWriter writePage = new BufferedWriter(new FileWriter(writer,true));
            BufferedReader readerPage = new BufferedReader(new FileReader(reader));
            String line = null;
            while ((line=readerPage.readLine())!=null){
                String cateInfo[] = line.split("\t");
                String pathCode = GetPathCode.getPathCode(appId,cateInfo[0]);
                writePage.write(line+"\t"+pathCode);
                writePage.flush();
                writePage.newLine();
            }
            writePage.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
