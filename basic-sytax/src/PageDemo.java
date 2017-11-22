// 三元运算符在分页业务逻辑中的使用
public class PageDemo {
	public static void main(String[] args) {
		/*
		 * 需求：给出一个共有46条数，要求没一页最多10条数据
		 * 计算：一共多少页
		 */
		int totalCount = 46;
		int pageSize = 10; // 每一页中含有多少数据
		
		// 总页数
		int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount/pageSize + 1;
		System.out.println(totalPage);
		
		int currentPage = 5;
		// 上一页
		int prevPage = currentPage - 1 >= 1 ? currentPage - 1 : 1; // 要考虑临界的问题
		System.out.println(prevPage);
		
		// 下一页
		int nextPage = currentPage + 1 >= totalPage ? totalPage : currentPage + 1;
		System.out.println(nextPage);
		
	}
}
