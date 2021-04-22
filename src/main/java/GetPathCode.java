import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GetPathCode {
    public static String getPathCode(String appId,String cateId) throws IOException {
        String userAgent = RandomUserAgent.getRandomUserAgent();
        String getItemIdURL = "https://open.api.ebay.com/Shopping?callname=GetCategoryInfo&appid=" + appId + "&version=967&siteid=2&CategoryID="+cateId;
        Document doc =null;
        try {
            Thread.sleep(1000);
            doc = Jsoup.connect(getItemIdURL).userAgent(userAgent).maxBodySize(0).get();
        }catch (IOException e){
            doc = Jsoup.connect(getItemIdURL).userAgent(userAgent).maxBodySize(0).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String ack = doc.selectFirst("Ack").text();
        if (ack.equals("Success")){
            String cateCode = doc.selectFirst("CategoryIDPath").text().replace(":",">") + "\t" + doc.selectFirst("CategoryNamePath").text().replace(":",">");
            return cateCode;
        }else {
            System.out.println("Check the ID limit!!!!");
            return "!";
        }

    }
}
