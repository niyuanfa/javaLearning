import java.util.*;
public class ArranTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);    //Scanner��
		int score1[];//����
		score1=new int[3];//�����ڴ��ַ	
		int score2[]=new int[3];//һ��������������������ڴ��ַ
		for (int i=0;i<score2.length;i++)
		{
			 System.out.println("�������"+(i+1)+"����:");
	         int intNum = in.nextInt();    //����string����
			 score2[i]=intNum;
		}
		int max=score2[0];
		int min=score2[0];
		int sum=0;
		for (int i=0;i<score2.length;i++)
		{
			sum+=score2[i];
			if(max<=score2[i])//ʼ�ձ���max�����ֵ
				max=score2[i];
			if(min>=score2[i])//ʼ�ձ���min����Сֵ
				min=score2[i];
			System.out.print(score2[i]+" ");
			//System.out.print("\n");
		}
		System.out.println("���ֵ��"+max);
		System.out.println("��Сֵ��"+min);
		System.out.println("ƽ��ֵ��"+((float)sum)/score2.length);
	}

}
