package simple;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @program: algorithm
 * @description: 反转一个单链表
 * @author: daitu
 * @date: 2019/04/09 15:41
 *
 *
 * 题目 反转一个单链表
 * 1-2-3-4-5
 * 反转成 5-4-3-2-1
 * 在同一个链表中
 */
public class FanzhuanLianbiao {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("反转之前的list:" + list.toString());
        int size = list.size();
        System.out.println("size:" + size);
        //ListIterator 操作list的迭代器
        //第一个迭代器
        ListIterator fwd = list.listIterator();
        //第二个迭代器 size 的作用 可以debug 看fwd跟rev的区别 返回列表中rev所需位置后面元素的索引
        ListIterator rev = list.listIterator(size);
        //mid=list.size()>>1 按位右移运算符。左操作数按位右移右操作数指定的位数  debug下来的话是这个样子的 size的大小决定了对调的次数
        //规律的结果就是 size=5 对调用 2 |  size = 6 对调用 3 | size = 7 对调用 3 | size = 8 对调用 4 | size = 9 对调用 4
        for (int i=0, mid=list.size()>>1; i<mid; i++) {
            //fwd.next() 返回列表中ListIterator指向位置后面的元素
            Object tmp = fwd.next();
            //rev.previous() 返回列表中ListIterator指向位置前面的元素
            Object o = rev.previous();
            //从列表中将next()或previous()返回的最后一个元素更改为指定元素
            fwd.set(o);
            rev.set(tmp);
        }
        System.out.println("反转之后的list:" + list.toString());
    }

}
