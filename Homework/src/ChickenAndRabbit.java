/**
 * 
 */

/**
 * @author tvbboy
 * ���õ���ѭ��ʵ�ּ���ͬ����35ͷ��94��
 *
 */
public class ChickenAndRabbit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int intChickens,intRabbits=0;
        for(intChickens=0;intChickens<=35;intChickens++)
        {
        	intRabbits=35-intChickens;
        	if(intChickens*2+intRabbits*4==94)
        	{
        		System.out.print("����"+intChickens+"ֻ��������"+intRabbits+"ֻ");
        		break;//�ҵ���֮������ѭ��for���������
        	}
        }
	}

}
