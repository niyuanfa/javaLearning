
import java.util.Scanner;

public class HowManyDays{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������ݣ�");
		int intYear = sc.nextInt();
		
		System.out.println("�������·ݣ�");
		int intMonth = sc.nextInt();
		
		System.out.println("�������գ�");
		int intDay = sc.nextInt();
		
		System.out.println("������������ǣ�" + intYear + "��" + intMonth + "��" + intDay + "��");
			
			
		//�ж�year�Ƿ�Ϸ�
		if(intYear < 0){
			System.out.println("��������ȷ���ڣ�");
			System.exit(0);
		}
		//�ж�year�Ƿ�Ϸ�����
		boolean isRun=false;
		if(intYear % 4 ==0 && intYear%100==0 || intYear%400==0){
			isRun=true;
		}
		
		//�ж�month��day�Ƿ�Ϸ�
		switch(intMonth){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(intDay < 0 || intDay > 31){
					System.out.println("��������ȷ���ڣ�"+intMonth+"���У��ձ�����1~31֮��");
					System.exit(0);
				}
				break;
				
			case 4: case 6: case 9: case 11:
				if(intDay < 0 || intDay > 30){
					System.out.println("��������ȷ���ڣ�"+intMonth+"���У��ձ�����1~30֮��");
					System.exit(0);
				}
				break;
				
			case 2:
				if(isRun){
					
					if(intDay < 0 || intDay > 29){
						System.out.println("��������ȷ���ڣ������ձ�����0~29֮��");
						System.exit(0);
					}
					
				}else{
					
					if(intDay < 0 || intDay > 28){
						System.out.println("��������ȷ���ڣ��������ձ�����0~28֮��");
						System.exit(0);
					}
				}
				break;
				
			default:
				System.out.println("��������ȷ����,�·ݱ�����1~12֮�䣡");
				System.exit(0);
				break;
				
		}
		//�ж�month��day�Ƿ�Ϸ�����
		
		
		int intTotalDays = intDay;
		
		/*
			���������ǵ������һ���������
		*/
		switch(intMonth - 1){
			
			case 11:
				intTotalDays = intTotalDays + 30;
			case 10:
				intTotalDays = intTotalDays + 31;
			case 9:
				intTotalDays = intTotalDays + 30;
			case 8:
				intTotalDays = intTotalDays + 31;
			case 7:
				intTotalDays = intTotalDays + 31;
			case 6:
				intTotalDays = intTotalDays + 30;
			case 5:
				intTotalDays = intTotalDays + 31;
			case 4:
				intTotalDays = intTotalDays + 30;
			case 3:
				intTotalDays = intTotalDays + 31;
				
			case 2:			//�ж�year��ƽ�껹������
				if(isRun){
					intTotalDays = intTotalDays + 29;
				}else{
					intTotalDays = intTotalDays + 28;
				}
				
			case 1:
				intTotalDays = intTotalDays + 31;
				break;
		}
		//sum = sum + day;
		//�������
		
		
		System.out.println("������������ǽ���ĵ�" + intTotalDays + "��");
	}
}