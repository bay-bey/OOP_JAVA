import java.util.Scanner;

public class atm {
public void calis(hesap Hesap) 
{login login=new login();
Scanner scanner=new Scanner(System.in);
System.out.println("Bankamıza hoşgeldiniz");
int giris_hakki=3;
while (true) 
{
	if (login.Login(Hesap))
	{
		System.out.println("Giriş başarılı");
		break;
	}
	else 
	{
	   System.out.println("Giriş başarısız");
	   giris_hakki-=1;
	}
	if (giris_hakki==0) {
		return;
	}
}
String islemler="1.Bakiye görüntüle\n"
				+"2.Para yatırma\n"
				+"3.Para çekme\n"
				+"Çıkış için q'ya basiniz";

System.out.println("**************************************");
System.out.println(islemler);
System.out.println("**************************************");


while(true)
{
	System.out.println("Lütfen işlem seçiniz ");
	String islem=scanner.nextLine();
	if(islem.equals("q"))
	{
		System.out.println("çıkış yapılıyor");
		break;
	}
	else if (islem.equals("1")) 
	{
		System.out.println("Bakiyeniz : "+Hesap.getBakiye());
	}
	else if (islem.equals("2")) {
		System.out.println("Yatırmak istediğiniz tutar : ");
		int tutar=scanner.nextInt();
		scanner.nextLine();
		
		Hesap.paraYatirma(tutar);
	}
	else if(islem.equals("3"))
	{
		System.out.println("Çekmek istediğiniz tutarı giriniz: ");
		int tutar=scanner.nextInt();
		scanner.nextLine();
		
		Hesap.paraCek(tutar);
	}
	else
		System.out.println("Geçersiz işlem");
	
}

}
}
