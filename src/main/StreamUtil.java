package main;
/*
作者：ypl
创建时间：2019-7-29-0:17-2019
*/


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author wxt.ypl
 * @version V1.0
 * @Title: StreamUtil
 * @Package main
 * @Description: (用一句话描述该文件做什么)
 * @date 2019-7-29 0:17
 */


public class StreamUtil {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "C", "");
        List<String> reslut = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        strings.stream().filter(str -> str.contains("a")).forEach(str -> System.out.println(str));
        System.out.println(reslut);
        System.out.println("------------------------");
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
        List<Integer> numbers = Arrays.asList(1, 3, 4, 56, 78);
        List<Integer> integers = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(integers);
    }
}
