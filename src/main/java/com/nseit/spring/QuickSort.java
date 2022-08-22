package com.nseit.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSort implements SortAlg {
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
