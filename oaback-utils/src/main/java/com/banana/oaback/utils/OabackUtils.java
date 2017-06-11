package com.banana.oaback.utils;

import java.util.Collection;

public class OabackUtils {
	
	@SuppressWarnings("rawtypes") 
	public boolean isEmptySet(Collection args) {
		if (args == null || args.isEmpty()) {
			return true;
		}
		return false; 
	}
	
}
