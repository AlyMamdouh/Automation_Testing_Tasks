package project;

import org.openqa.selenium.Cookie;

import java.io.*;
import java.util.Date;
import java.util.StringTokenizer;

import static project.TestBase.AlyDriver;

public class Cookies

{
  String url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
    public void writeCookies () {
        File file = new File("Cookies");
        try {
                file.createNewFile();
                FileWriter fw = new FileWriter(file);
                  BufferedWriter bw = new BufferedWriter(fw);

            for (Cookie cok : AlyDriver.manage().getCookies()) {
                bw.write((cok.getName()+";"+cok.getValue()+";"+cok.getDomain()+";"+cok.getPath()+";"+cok.getExpiry()+";"+cok.isSecure()));
                bw.newLine();
            }
            bw.close();
            fw.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void ReadCookies()
    {
        try{

            File file = new File("Cookies");
            FileReader fileReader = new FileReader(file);
            BufferedReader Buffreader = new BufferedReader(fileReader);
            String strline;
            while((strline=Buffreader.readLine())!=null){
                StringTokenizer token = new StringTokenizer(strline,";");
                while(token.hasMoreTokens()){
                    String name = token.nextToken();
                    String value = token.nextToken();
                    String domain = token.nextToken();
                    String path = token.nextToken();
                    Date expiry = null;

                    String val;
                    if(!(val=token.nextToken()).equals("null"))
                    {
                        expiry = new Date(val);
                    }
                    Boolean isSecure = new Boolean(token.nextToken()).
                            booleanValue();
                    Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);
                    System.out.println(ck);
                    AlyDriver.manage().addCookie(ck); // This will add the stored cookie to your current session
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        AlyDriver.navigate().to(url);
    }
}

