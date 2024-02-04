package Burc;
import java.util.Scanner;
public class Burc {
	public static void main(String[]args) {
		int ay,gun;
		Scanner inp = new Scanner(System.in);
		ay = inp.nextInt();
		Scanner inpa = new Scanner(System.in);
		gun = inpa.nextInt();
	if(ay==1) {
		if(gun>=22) {
			System.out.print("kova burcu");
		}
		else {
			System.out.print("oğlak burcu");
		}
	}else if(ay==2) {
		if(gun>=20) {
			System.out.print("balık burcu");
		}
		else {
			System.out.print("kova burcu");
		}}
	else if(ay==3) {
		if(gun<=20) {
			System.out.print("balık burcu");
		}			else {
			System.out.print("koç burcu");
		}}
		else if(ay==4) {
			if(gun<=21) {
				System.out.print("koç burcu");
			}
			else {
				System.out.print("boğa burcu");
			}}
		else if(ay==5) {
			if(gun<=21) {
				System.out.print("boğa burcu");
			}
			else {
				System.out.print("ikizler burcu");
			}}
		else if(ay==6) {
			if(gun<=22) {
				System.out.print("ikizler burcu");
			}
			else {
				System.out.print("yengeç burcu");
			}}
		else if(ay==7) {
			if(gun<=22) {
				System.out.print("yengeç burcu");
			}
			else {
				System.out.print("aslan burcu");
			}}
		else if(ay==8) {
			if(gun<=22) {
				System.out.print("aslan burcu");
			}
			else {
				System.out.print("başak burcu");
			}}
		else if(ay==9) {
			if(gun<=22) {
				System.out.print("başak burcu");
			}
			else {
				System.out.print("terazi burcu");
			}}
		else if(ay==10) {
			if(gun<=22) {
				System.out.print("terazi burcu");
			}
			else {
				System.out.print("akrep burcu");
			}}
		else if(ay==11) {
			if(gun>=22) {
				System.out.print("yengeç burcu");
			}
			else {
				System.out.print("yay burcu");
			}}
		else if(ay==12) {
			if(gun>=22) {
				System.out.print("oğlak burcu");
			}
			else {
				System.out.print("yay burcu");
			}
		}
	}
}
