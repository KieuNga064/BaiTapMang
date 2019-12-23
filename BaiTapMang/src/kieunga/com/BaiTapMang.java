package kieunga.com;

import java.util.Arrays;
import java.util.Scanner;


public class BaiTapMang {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời bạn nhập số phần tử mảng: ");
		int spt=sc.nextInt();
		System.out.println("Mời bạn nhập vào mảng: ");
		int []M=new int[spt];
		for (int i = 0; i < M.length; i++) 
		{
			M[i]=sc.nextInt();
		}
		int []soChan=timSoChan(M);
		int []soLe=timSoLe(M);
		int []soNguyenTo=timSoNguyenTo(M);
		int []soKhongPhaiNguyenTo=timSoKhongNguyenTo(M);
		System.out.print("Số chẵn: ");
		demVaXuatPhanTuMang(soChan);
		System.out.print("Số lẻ: ");
		demVaXuatPhanTuMang(soLe);
		System.out.print("Số nguyên tố: ");
		demVaXuatPhanTuMang(soNguyenTo);
		System.out.print("Số không phải là số nguyên tố: ");
		demVaXuatPhanTuMang(soKhongPhaiNguyenTo);
	}

	static void demVaXuatPhanTuMang(int []M)
	{
		for (int i = 0; i < M.length; i++)
		{
			System.out.print(M[i]+" ");
		}
		System.out.println(" ==> tổng số: "+M.length);
	}
	static int[] timSoChan(int []M)
	{
		int []soChan=null;
		int a=0;
		for(int i = 0; i < M.length; i++)
		{
			if(M[i]%2==0)
				a++;				 
		}
		if(a==0)
			System.out.println("Không có số chẵn.");		   
		else
		{
		soChan=new int[a];
		a=0;
		for(int i = 0; i < M.length; i++)
		{
			if(M[i]%2==0)
			{
				soChan[a]=M[i];
				a++;
			}
		}
		}
		return soChan;
	}
	static int[] timSoLe(int []M)
	{
		int []soLe=null;
		int a=0;
		for(int i = 0; i < M.length; i++)
		{
			if(M[i]%2!=0)
				a++;				 
		}
		if(a==0)
			System.out.println("Không có số chẵn.");		   
		else
		{
		soLe=new int[a];
		a=0;
		for(int i = 0; i < M.length; i++)
		{
			if(M[i]%2!=0)
			{
				soLe[a]=M[i];
				a++;	
			}
		}
		}
		return soLe;
	}
	static int[] timSoNguyenTo(int []M)
	{
		int []soNT=null;
		int a=0;
		for(int i = 0; i < M.length; i++)
		{
			if(laSoNguyenTo(M[i]))
				a++;				 
		}
		if(a==0)
			System.out.println("Không có số chẵn.");		   
		else
		{
		soNT= new int[a];
		a=0;
		for(int i = 0; i < M.length; i++)
		{
			if(laSoNguyenTo(M[i]))
			{
				soNT[a]=M[i];
				a++;	
			}
		}
		}
		return soNT;
	}
	static int[] timSoKhongNguyenTo(int []M)
	{
		int []soKNT=null;
		int a=0;
		for(int i = 0; i < M.length; i++)
		{
			if(!laSoNguyenTo(M[i]))
				a++;				 
		}
		if(a==0)
			System.out.println("Không có số chẵn.");		   
		else
		{
		soKNT=new int[a];
		a=0;
		for(int i = 0; i < M.length; i++)
		{
			if(!laSoNguyenTo(M[i]))
			{
				soKNT[a]=M[i];
				a++;	
			}
		}
		}
		return soKNT;
	}
	static boolean laSoNguyenTo(int a)
	{
		boolean kt=false;
		int dem=0;
		for (int i = 1; i <= a; i++) 
		{
			if(a%i==0)
				dem++;
		}
		if(dem==2)
			kt=true;
		return kt;
	}
}
