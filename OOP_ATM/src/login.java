import java.util.Scanner;

public class login {
	public boolean Login(hesap Hesap)
	{
	
		Scanner veri=new Scanner(System.in);
		String kullanici_adi;
		String parola;
	
		System.out.print("Kullanıcı adı : ");
		kullanici_adi=veri.nextLine();
		System.out.print("Parola : ");
		parola=veri.nextLine();
		if(Hesap.getKullanici_adi().equals(kullanici_adi) && Hesap.getParola().equals(parola)) 
		{
		return true;
		}
		else 
		{
		return false;
		}
	}

}
