// �߼������
public class LogicalOperatorDemo {
	public static void main(String[] args) {
		/*
		 * �룺  boolean���ʽA �� boolean���ʽB
		 *      ������Ϊtrue��ʱ��Ϊtrue
		 *  & ��λ��
		 *  &&����·��
		 * ��
		 * 	|�� ��ʹAΪtrue��Ҳ��ִ��B���ʽ
		 *  ||����·��ֻҪA���ʽΪtrue�����̷���true���Ͳ���ִ��B���ʽ 
		 */
		System.out.println(true & true); //true
		System.out.println(true & false); //false
		System.out.println(false & true); //false
		System.out.println(false & false); //false
		System.out.println("----------------------");
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); //false
		System.out.println("----------------------");
		//System.out.println(false & (1 / 0 == 1)); // ��& �ᱨ��,��·���򲻻�
		System.out.println(false && (1 / 0 == 1)); // false
		System.out.println("-----------������-----------");
		System.out.println(true | true); // true
		System.out.println(true | false); // true
		System.out.println(false | true); // true
		System.out.println(false | false); // false
		System.out.println("----------------------");
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		System.out.println(false || true); //true
		System.out.println(false || false); // false
		System.out.println("-----------���-----------");
		System.out.println(true ^ true); //false
		System.out.println(true ^ false); //true
		System.out.println(false ^ true); //true
		System.out.println(false ^ false); //false
	}
}
