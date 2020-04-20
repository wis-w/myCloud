package demo;
import java.util.*;


/**
 * @author wyg_edu
 * @version 1.0
 * @date 2020/4/20 8:20
 * 集合类不安全
 */
public class containerNotSafeDemo {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();// 线程不安全
        List<String> list = Collections.synchronizedList(new ArrayList<>());//线程安全

        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
        // 1、故障问题
            // java.util.ConcurrentModificationException 并发写异常
        // 2、导致原因
        // 3、解决方案
            // 1）new Vector()
            // 2) Collections.synchronizedList(new ArrayList<>())

    }
}
