package cleancode.annotation;


import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.lang.reflect.Field;

public class Framework {
	void processNotNullOrEmpty(Object obj)
	{
		Class<?> clazz = obj.getClass();
		//System.out.println("Class "+clazz.getName());
		
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields)
		{
			
			Annotation[] annotations = field.getAnnotations();
			for(Annotation anno : annotations)
			{
				
				if(anno instanceof NotNullOrEmpty)
				{
					//System.out.println("Field " + field.getName() );
					//System.out.println("Annotation "+anno);
					NotNullOrEmpty notNullAnno = (NotNullOrEmpty)anno;
					try {
						String value = (String)field.get(obj);
						if(value == null || value.isEmpty())
						{
							System.err.println(notNullAnno.message());
						}
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		Framework framework = new Framework();
		
		Human h = new Human();
		h.name = "Something";
		framework.processNotNullOrEmpty(h);
		
		Alien alien = new Alien();
		framework.processNotNullOrEmpty(alien);
	}
}
