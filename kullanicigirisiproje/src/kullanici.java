import java.util.Scanner;
public class kullanici {
    //Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
    // eğer kullanıcı sıfırlamak isterse
    // yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
    // şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
    // sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
    public static void main (String[]args){
        String userName,passWord;
        Scanner input= new Scanner(System.in);
        System.out.print("KULLANICI ADI:");
        userName= input.nextLine();
        System.out.print("ŞİFRE:");
        passWord=input.nextLine();
    if(userName.equals("patika")&& passWord.equals("java123")){
        System.out.println("Giriş Yapıldı");}
    else {System.out.println("Hatalı Giriş");
        String e,h,yenisifre;
        System.out.println("ŞİFRE SIFIRLAMAK İSTER MİSİNİZ?");
        System.out.println("YAZINIZ:e? h?");
        e=input.nextLine();

        System.out.println("YENİ ŞİFRE GİRİNİZ:");
        yenisifre=input.nextLine();
            if (yenisifre.equals("java123")){
            System.out.println("ŞİFRE OLUŞTURULAMADI");
            System.out.println("LÜTFEN BAŞKA ŞİFRE GİRİNİZ:");
            System.out.println("YENİ ŞİFRE GİRİNİZ:");
            yenisifre=input.nextLine();
            System.out.println("YENİ ŞİFRE GİRİNİZ:");
            yenisifre=input.nextLine();
            System.out.println("YENİ ŞİFRE OLUŞTURULDU");}
            else {System.out.println("ŞİFRE OLUŞTURULDU");}}

        }


    }







