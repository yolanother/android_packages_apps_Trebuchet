package com.cyanogenmod.trebuchet;

import java.lang.reflect.Field;

public class InternalR {
	public static class styleable {
		public static int[] DialogPreference;
		public static int Preference_defaultValue;
	}
	
	public static class id {
		public static int numberpicker_input;
		public static int title;
		public static int summary;		
	}
	
	static {
		try {
			Class<?> styleable = Class.forName("com.android.internal.R$styleable");
			
			Field field = styleable.getField("DialogPreference");
			InternalR.styleable.DialogPreference = (int[]) field.get(null);			
			field = styleable.getField("Preference_defaultValue");
			InternalR.styleable.Preference_defaultValue = field.getInt(null);
			

			Class<?> id = Class.forName("com.android.internal.R$id");

			field = id.getField("numberpicker_input");
			InternalR.id.numberpicker_input = field.getInt(null);
			field = id.getField("title");
			InternalR.id.title = field.getInt(null);
			field = id.getField("summary");
			InternalR.id.summary = field.getInt(null);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
