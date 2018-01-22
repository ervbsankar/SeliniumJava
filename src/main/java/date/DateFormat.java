package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    public static void main(String[] args){
        SimpleDateFormat format = new SimpleDateFormat("mm/dd/yyyy");
        String strDate = format.format(new Date());
        System.out.println(strDate);
    }
}
