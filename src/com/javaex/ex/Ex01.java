package com.javaex.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
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
			//System.out.println(str);
		
			String[] sArray = str.split(",");
		
			/*
			System.out.println(sArray[0]);
			System.out.println(sArray[1]);
			System.out.println(sArray[2]);
			System.out.println("********************");
		 	*/
			
			String name = sArray[0];
			String hp = sArray[1];
			String company = sArray[2];
		
			
			Person p = new Person(name,hp,company);
			
			 pList.add(p);
		
		}
		
		Person p00 = pList.get(0);
		Person p01 = pList.get(1);
		Person p02 = pList.get(2);

		/*
		for (Person p : pList) {
			System.out.println(p.getName()+p.getHp()+p.getCompany());
		}
		*/
		
		
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
					
					continue;
				 
				}else if(menuNo==3) {
					System.out.println("<3.삭제>");
					
					continue;
					 
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
		
} //while끝
		

	

