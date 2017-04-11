package ooExamples;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/*
 * �������������һ��Class
 */
public class clsPerson {
	/*
	 * ���������������
	 * 
	 */
	private String strGender;//�Ա�
	private String strName; //����
	private int  intAge ; //����
	private double fltWeight;//���أ���λ�
	private double fltHeight;//��ߣ���λcm��
	private String strSkin;//��ɫ
	private Date dteBirthdate;//��������
	private boolean isDead;//�Ƿ�����
	
	/*
	 * ����������ķ���
	 * 
	 */
	//�÷������˳����������ǳ��������£��Ա𣬷�ɫ�����أ����
	public void Born(String par1,String par2,String par3,double par4,double par5) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		dteBirthdate = sdf.parse(par1); //���ַ������͵�����תΪ��������
		strSkin=par3;//������ɫ
		strGender=par2;//�����Ա�
		intAge=0;//��������
		fltWeight=par4;//��������
		fltHeight=par5;//�������
		isDead=false;//����û������
	}
	private void Eat()
	{
		if(!chkDeath())
		{
			 fltWeight+=0.1;
			 fltHeight+=0.1;
		}
	}
	//����Ϊ˯����ʱ�䵥λ��Сʱ��
	private void Sleep(int par1) 
	{
		if(!chkDeath())//���û������
		{
			if(par1>10)
			{
				System.out.print("��������˯��ʱ����ò�Ҫ����10Сʱ");
			}
			else
			{
				fltWeight+=0.02*par1;
				fltHeight+=0.03*par1;
			}
		}
	}
	//����Ϊ�ɳ���ʱ��(��λ��)
	private void Grow(int par1)
	{
		chkDeath();
		intAge+=par1;
	}
	public void Death()
	{
		isDead=true;
		
	}
	//����һ�����Ƿ�����
	private boolean chkDeath()
	{
		if(isDead)
		{
			System.out.print("�����Ѿ�����");
			
		}
		return isDead;
	}
	//��ʾ����˵�״̬
	public void Display()
	{
		System.out.println("���:"+fltHeight);
		System.out.println("����:"+fltWeight);
		System.out.println("�Ա�:"+strGender);
		System.out.println("��ɫ:"+strSkin);
		System.out.println("����:"+intAge);
		System.out.println("��������:"+dteBirthdate);
		System.out.println("�Ƿ����:"+!isDead);
	}
}

