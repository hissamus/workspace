package learn;

public class CurrentSystemDate {
public static void main(String[] args) {
        SimpleDateForma sysForm = new SimpleDateFormat("yyyy/MM/DD HH:mm:ss");
        Date curdate= new Date();
        System.out.println(sysForm.format(curdate));
}
}