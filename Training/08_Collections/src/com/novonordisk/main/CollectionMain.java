package com.novonordisk.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionMain {
	public static void main(String[] args) {
		System.out.println("1. ArrayList");

		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names.size());
		names.add("Reema");
		names.add("Soma");
		names.add("Sema");
		names.add("Reema");
		names.add("Soma");
		names.add("Sema");
		System.out.println(names.size());
		System.out.println(names);
		System.out.println("----------");
		names.remove("Soma");
		System.out.println(names);
		System.out.println(names.size());

		System.out.println("----------");

		System.out.println("2. HashSet");
		HashSet<String> nameSet = new HashSet<String>();
		System.out.println(nameSet.size());
		nameSet.add("Reema");
		nameSet.add("Soma");
		nameSet.add("Sema");
		nameSet.add("Reema");
		nameSet.add("Soma");
		nameSet.add("Sema");
		System.out.println(nameSet.size());
		System.out.println(nameSet);
		nameSet.remove("Soma");
		System.out.println(nameSet);
		System.out.println(nameSet.size());

		System.out.println("----------");

		System.out.println("3. TreeSet");
		TreeSet<String> nameTreeSet = new TreeSet<String>();
		System.out.println(nameTreeSet.size());
		nameTreeSet.add("Reema");
		nameTreeSet.add("Soma");
		nameTreeSet.add("Sema");
		nameTreeSet.add("Reema");
		nameTreeSet.add("Soma");
		nameTreeSet.add("Sema");
		System.out.println(nameTreeSet.size());
		System.out.println(nameTreeSet);
		nameTreeSet.remove("Soma");
		System.out.println(nameTreeSet);
		System.out.println(nameTreeSet.size());

	}
}
