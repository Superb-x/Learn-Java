package com.superbx.java8;

import java.util.List;

@FunctionalInterface
public interface IMyCreator<T extends List<?>> {
	T create();
}
