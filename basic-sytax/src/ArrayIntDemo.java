// java����
public class ArrayIntDemo {
	public static void main(String[] args) {
		int[] arr = new int[]{1,3,5,7,9}; // �������û�����õĻ��ǻᱻ���ٵ� 
		/*
		 * new �ؼ������ڶ��ڴ��п���һ���ڴ����������洢����
		 * �����ڴ��ַ��ʮ����������ʾ�ģ�
		 * java�����飬�����࣬�����ڶ��ڴ���
		 */
		arr = new int[]{1,2,3};
		//System.out.println(arr.length);
		/*
		 * ����������֪��Ҫ����Щ���ݵ�ʱ�򣬾��þ�̬��ʼ��������
		 * ��֪��Ҫ�洢��Щ���ݵ�ʱ��ֻ��ʹ�ö�̬��ʼ��
		 */
		int[] nums = new int[]{1,2,3,4,5};
		//System.out.println(nums.length);
		
		String[] nums2 = null;
		// System.out.println(nums2.length); // ���ǻᱨ��ģ���ָ����
		for (int i = 0;i < nums.length;i++){
			System.out.println(nums[i]);
		}
	}
}