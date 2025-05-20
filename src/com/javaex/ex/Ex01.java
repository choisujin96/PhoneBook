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
		
		Writer fw = new FileWriter("C:\\javaStudy\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		/*
		for(int i=0; i<=pList.size(); i++) {
			bw.write(pList.get(i).getName());
			
		}
		*/
		bw.write("이효리" + "," + "010-2222-3333" + "," + "031-123-3333"+"\n");
		bw.write("정우성" + "," + "010-4444-5555" + "," + "033-898-1222"+"\n");
		bw.write("유재석" + "," + "010-4545-8215" + "," + "02-123-4569"+"\n");
		bw.write("이정재" + "," + "010-7777-6666" + "," + "041-555-3652"+"\n");
		
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
		
			
			
			
		}
		
		br.close();
		bw.close();
		
		
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
				System.out.println(">1.리스트");
				
				continue;
			
				}else if(menuNo==2) {
					System.out.println(">2.등록");
					
					continue;
				 
				}else if(menuNo==3) {
					System.out.println(">3.삭제");
					
					continue;
					 
				 }else if(menuNo==4) {
					System.out.println(">4.검색");
					
					continue;
				 
				 }else if(menuNo==5) {
					System.out.println(">5.종료");
					
					System.out.println("*****이용해주셔서 감사합니다.*******");
					break;
			
				 } else {
					System.out.println("다시 입력해주세요.");
					continue;
				}
				

		}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
			
		} //while끝
		
	
	
		
		



	
}
