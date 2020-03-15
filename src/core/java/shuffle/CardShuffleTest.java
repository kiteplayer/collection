package core.java.shuffle;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class CardShuffleTest {
    public static void main(String[] args)
    {//读取属性文件a.properties
        Properties prop = new Properties();
        ArrayList<String> color= new ArrayList<String>();
        System.out.println(CardShuffleTest.class.getResource("").getPath());
        System.out.println(CardShuffleTest.class.getResource("/").getPath());
        System.out.println(CardShuffleTest.class.getClassLoader().getResource("").getPath());


        try {
            //InputStream in = new BufferedInputStream(new FileInputStream("F:\\windows\\IDEA\\corejava10.1\\out\\production\\corejava10.1\\v1ch09\\shuffle\\color.properties"));
            InputStream in=CardShuffleTest.class.getResourceAsStream("color.properties");
            prop.load(in);
            for (String key : prop.stringPropertyNames()) {
                  color.add(prop.getProperty(key));
            }

            ;
           /* Iterator<String> it=prop.stringPropertyNames().iterator();
            while (it.hasNext()){
                for (int i = 0; i <4 ; i++) {
                   color[i]=it.next();
                }
            }*/
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        List<String> cards = new ArrayList<>();

        //String[] color={"#","$","&","*"};//表示黑红梅方
        //表示13张牌
        String[] number={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (String s:color) {
            for (String n:number) {
                cards.add(s+n);
            }
        }
        System.out.println(cards);
        Collections.shuffle(cards);
        List<String> onePlayerOfCard=cards.subList(0, 12);
        System.out.println(onePlayerOfCard);
    }
}
