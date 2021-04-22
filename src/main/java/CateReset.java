import java.util.HashSet;
public class CateReset {
    public static void cateReset(String code1,String category1,HashSet ch1){
        String[] code = code1.split(">");
        String[] category = category1.split(">");
        //HashSet<String> ch = new HashSet<String>();
        //TODO: code,category,ch pass from main()
        String Flag = "|";
        for (int i=0;i<= code.length-1;i++){
            Flag = Flag + " > " + category[i] + " ( " + code[i] + " )" ;
            if(!ch1.contains(Flag)){
                ch1.add(Flag);
                System.out.println(Flag);//TODO:Change to file write
            }
        }
    }
}
