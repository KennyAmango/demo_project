package com.example.demo_project.service.impl;



import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Menu;
import com.example.demo_project.service.ifs.OrderService;
@Service
public class OrderServiceImpl extends Menu implements OrderService{

	@Override
	public void getPrice(String name) {
		
		if(name == "beef") {
			super.setPrice(100);
			System.out.println(super.getPrice());
		}
		if(name == "pork") {
			super.setPrice(90);
			System.out.println(super.getPrice());
		}
		if(name == "chicken") {
			super.setPrice(80);
			System.out.println(super.getPrice());
		}
		
	}
	
	@Override
	public void totalPrice() {
		int sum;
		double sumplus = 0;
		String name;
		int s2;
		int p1 = 0;
		int s3;
		int x = 0;
		String[][]round2 = new String[3][1];
		int[][]round =new int[3][2];
		Scanner scanner = new Scanner(System.in);
		for(int count = 0; count < 10;count++) {
			System.out.println("�п�J�\�I�~��");
			name = scanner.next();
			if(name.equals("beef")) {
				 p1 = 100;
			}
			else if(name.equals("pork")) {
				 p1 = 90;
			}
			else if(name.equals("chicken")) {
				 p1 = 80;
			}
			else {System.out.println("�L���~��,�Э��s��J");
			continue;
			}
			System.out.println("�п�J�\�I�ƶq");
			s2 = scanner.nextInt();
			round2 [x][0] = name;
			round [x][0] = p1;
			round [x][1] = s2;
			x++;
			sum = p1 * s2;
			sumplus += sum;
		    if(sumplus  > 500) {
		    	sumplus = sumplus *0.9;
		    }
		    System.out.println("�~���I�\�п�J1,�����I�\�п�J0");
			s3 = scanner.nextInt();
			if(s3 == 0) {
				for(x = 0; x <= count ;x++) {
					String n = round2[x][0];
					int a = round[x][0];
					int b = round[x][1];
					int c = a * b;
					System.out.printf("�~��:%s ���:%d ����:%d �p�p:%d��\n ",n,a,b,c);	
				}
				System.out.println("�H�W���z���骺�\�I:");
				if(sumplus > 500) {
					System.out.println("�]���O���B��500��,������O���B9���u�f");
				}
				System.out.println("�`�p:"+ sumplus +"��");
			    break;
			}	
		}	
	}

	
	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		
	}

	

}