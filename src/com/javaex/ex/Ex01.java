package com.javaex.ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		List<Person> pList = new ArrayList<Person>();
		
	
		
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);	
		
		
		while(true) {
			String str = br.readLine();
			
			
			if(str == null) {
				break;
			}
		
			String[] sArray = str.split(",");
		
			
			String name = sArray[0];
			String hp = sArray[1];
			String company = sArray[2];
		
			
			Person p = new Person(name,hp,company);
			
			 pList.add(p);
		
		}
		
		
		
		while(true) {
			System.out.println("");
			System.out.println("***************************************");
			System.out.println("*       전화번호 관리 프로그램        *");
			System.out.println("***************************************");
			System.out.println("");
			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.println("---------------------------------------");
			System.out.print(">메뉴번호:");
			
			int menuNo = sc.nextInt();
			
			if(menuNo==1) {
				System.out.println("<1.리스트>");
				for(int i=0; i<pList.size(); i++) {
						System.out.print(i+1);
					System.out.println("."+ pList.get(i).getName() + "\t" + 
							pList.get(i).getHp() + "\t" + pList.get(i).getCompany());
					
				}
			
				continue;
			
				
				}else if(menuNo==2) {
					System.out.println("<2.등록>");
					
					Writer fw = new FileWriter("C:\\javaStudy\\PhoneDB.txt");
					BufferedWriter bw = new BufferedWriter(fw);		
					
					System.out.print("이름:");
					String name = sc.next(); 
					
					System.out.print("핸드폰:");
					String hp = sc.next();
					
					System.out.print("회사:");
					String company = sc.next();
					Person pp = new Person(name, hp,company);
					
					pList.add(pp);
					
					
					for(int i=0; i<pList.size();i++) {
						bw.write(pList.get(i).getName() + "," + pList.get(i).getHp() + ","
								+ pList.get(i).getCompany()); 
						bw.newLine();
							
					}
					
					bw.close();
					
					System.out.println("[등록되었습니다.]");
					continue;
				 
					
				}else if(menuNo==3) {
					System.out.println("<3.삭제>");
					
					Writer fw = new FileWriter("C:\\javaStudy\\PhoneDB.txt");
					BufferedWriter bw = new BufferedWriter(fw);		
					
					System.out.print("이름:");
					String name = sc.next(); 
					
					System.out.print("핸드폰:");
					String hp = sc.next();
					
					System.out.print("회사:");
					String company = sc.next();
					Person pp = new Person(name, hp,company);
					
					pList.add(pp);
					
					
					for(int i=0; i<pList.size();i++) {
						bw.write(pList.get(i).getName() + "," + pList.get(i).getHp() + ","
								+ pList.get(i).getCompany()); 
						bw.newLine();
					
					continue;
					
					
					System.out.println("삭제되었습니다.");
					
				}else if(menuNo==4) {
					System.out.println("<4.검색>");
					
					continue;
				 
					
				 }else if(menuNo==5) {
					System.out.println("<5.종료>");
					
					System.out.println("*****이용해주셔서 감사합니다.*******");
					break;
			
					
				 } else {
					System.out.println("다시 입력해주세요.");
					continue;
				}
				
		}
	}	
		
}
		

	

