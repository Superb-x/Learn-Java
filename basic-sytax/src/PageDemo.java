// ��Ԫ������ڷ�ҳҵ���߼��е�ʹ��
public class PageDemo {
	public static void main(String[] args) {
		/*
		 * ���󣺸���һ������46������Ҫ��ûһҳ���10������
		 * ���㣺һ������ҳ
		 */
		int totalCount = 46;
		int pageSize = 10; // ÿһҳ�к��ж�������
		
		// ��ҳ��
		int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount/pageSize + 1;
		System.out.println(totalPage);
		
		int currentPage = 5;
		// ��һҳ
		int prevPage = currentPage - 1 >= 1 ? currentPage - 1 : 1; // Ҫ�����ٽ������
		System.out.println(prevPage);
		
		// ��һҳ
		int nextPage = currentPage + 1 >= totalPage ? totalPage : currentPage + 1;
		System.out.println(nextPage);
		
	}
}
