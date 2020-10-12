package edu.neu.coe.info6205.union_find;

import java.util.function.Consumer;
import java.util.function.Supplier;

import edu.neu.coe.info6205.util.Benchmark_Timer;

public class Benchmark {
	
	private static double BenchmarkHWQUPC(int n) {
        Consumer<Integer> c = xs -> UF_HWQUPC.count(xs);
        Benchmark_Timer<Integer> f = new Benchmark_Timer<Integer>("HWQUPC", c);
        return f.run(n, 500);
	}
	
	private static double BenchmarkWQU(int n) {
        Consumer<Integer> c = xs -> WQU.count(xs);
        Benchmark_Timer<Integer> f = new Benchmark_Timer<Integer>("WQU", c);
        return f.run(n, 500);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 500;
		int m = 500;
		for(int i = 0; i < 8; i++) {
			double a = BenchmarkHWQUPC(n);
			System.out.printf("%-15s", "n:" + n);
			System.out.println("time:" + a);
			n *= 2;
		}
		for(int i = 0; i < 8; i++) {
			double a = BenchmarkWQU(m);
			System.out.printf("%-15s", "n:" + m);
			System.out.println("time:" + a);
			m *= 2;
		}
	}

}
