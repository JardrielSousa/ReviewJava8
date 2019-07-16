package br.com.aprendendojava.lambdas.test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import static java.util.Arrays.asList;

import java.util.ArrayList;
public class Lambdas {

	public static void main(String[] args) {
	
		For(asList("dev","java","bv"), (String s) -> System.out.println(s));
		List<Integer> list = map(asList("dev","java","bv"), (String s) -> s.length());
		System.out.println(list);
	}

	public static <T> void For(List <T> list , Consumer<T> c) {
		for(T e : list) {
			c.accept(e);
		}
	}
	public static <T,R> List<R> map(List<T> list,Function<T, R> f) {
		List<R> result = new ArrayList<>();
		for(T c : list) {
			result.add(f.apply(c));
		}
		return result;
	}
}
