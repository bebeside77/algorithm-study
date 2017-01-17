package com.may.algorithm;

/**
 * @author bebeside77
 */
public class ArrayDistinct {

	public Object[] getDistinct(Object[] array) {
		Object[] result = new Object[array.length];

		for (int i = 0; i < array.length; i++) {
			boolean exists = false;

			for (int j = 0; j < result.length; j++) {
				if (result[j] != null && result[j].hashCode() == array[i].hashCode()) {
					exists = true;
				}
			}
		}

		return null;
	}
}
