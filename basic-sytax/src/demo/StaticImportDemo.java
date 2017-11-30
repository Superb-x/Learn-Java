package demo;
// 静态导入
import static java.util.Arrays.*; 
/*
 * 静态导入，容易分不清某一个静态方法或字段的来源，
 * 最好不要这样做，实际开发中也不能这样做，通过反编译工具，可以看到所谓的静态导入其实就是个语法塘，
 * 其底层还是通过类调用
 */

public class StaticImportDemo {

}
