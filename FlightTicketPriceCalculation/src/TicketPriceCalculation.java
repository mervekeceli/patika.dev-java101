import java.util.Scanner;
public class TicketPriceCalculation {
    public static void main(String[] args) {
        int km, age, type;
        double normalAmount = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz(1 => Tek Yön, 2 => Gidiş Dönüş): ");
        type = input.nextInt();

        /*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        * Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        * Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
        *  sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        *
        * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi
        * ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        * Kişi 65 yaşından büyük ise bilet ftiyatı üzerinden %30 indirim uygulanır.
        * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        * */
        if( km > 0 && age > 0 && (type == 1 || type == 2) ){
            normalAmount = km * 0.10;
            if(age < 12){
                normalAmount -= normalAmount * 0.5;
                System.out.println(age + " yaşında olduğu için %50 indirimli fiyat: "+ normalAmount);
                switch (type){
                    case 1:
                        System.out.print("Toplam tutar: "+normalAmount);
                        break;
                    case 2:
                        normalAmount-=normalAmount * 0.2;
                        System.out.println("Toplam Tutar "+ normalAmount);
                        break;
                }
            }
            else if(age >=12 && age <= 24){
                normalAmount -= normalAmount * 0.1;
                switch (type){
                    case 1:
                        System.out.println("Toplam Tutar: "+normalAmount);
                        break;
                    case 2:
                        normalAmount-=normalAmount * 0.2;
                        System.out.println("Toplam Tutar: "+normalAmount);
                        break;
                }
            }
            else if(age <= 65){
                switch (type){
                    case 1:
                        System.out.println("Toplam Tutar: "+normalAmount);
                        break;
                    case 2:
                        normalAmount -= normalAmount * 0.2;
                        System.out.println("Toplam Tutar: "+normalAmount);
                        break;
                }
            }
            else{
                normalAmount -= normalAmount * 0.3;
                switch (type){
                    case 1:
                        System.out.println("Toplam Tutar: "+normalAmount);
                        break;
                    case 2:
                        normalAmount -= normalAmount * 0.2;
                        System.out.println("Toplam Tutar: "+normalAmount);
                        break;
                }
            }
        }else
            System.out.println("Hatalı Veri Girdiniz.");
    }
}
