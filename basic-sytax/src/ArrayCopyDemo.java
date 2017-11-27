// 数组拷贝操作
public class ArrayCopyDemo {
	public static void main(String[] args) {
		int[] src = new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] dest = new int[10];
		/*
		 *	需求：从src数组中拷贝3,4,5,6元素到dest数组中
		 */
		copy(src, 2, dest, 5, 4);
		for(int i = 0;i < dest.length;i++) {
			System.out.println(dest[i]);
		}
		
	}
	
	static void copy(int[] src, int srcPost, int[] dest, int destPost, int length){
		// 编写代码一定要时刻考虑代码的健壮性
		if (srcPost <= 0 || destPost <= 0 || length <= 0) {
			
		}
		for (int i = 0; i < length;i++) {
			dest[destPost] = src[srcPost];
			srcPost++;
			destPost++;
		}
		/*
		 * System.arraycopy
		 */
	}
}
