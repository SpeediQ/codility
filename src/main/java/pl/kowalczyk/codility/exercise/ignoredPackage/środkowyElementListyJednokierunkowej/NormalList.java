package pl.kowalczyk.codility.exercise.ignoredPackage.środkowyElementListyJednokierunkowej;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class NormalList {
    public static void main(String[] args) {
        int[] ints = generateArray();
        List<Integer> collect = Arrays.stream(ints).boxed().sorted((o1, o2) -> -1 * (o1 - o2)).collect(Collectors.toList());
        System.out.println(collect);

    }

    private static int[] generateArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(11);
        }
        return array;
    }
}
